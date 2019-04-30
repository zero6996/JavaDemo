package ZeroDemos.Demo4_23;

import java.util.Objects;

public class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    // 重写toString()方法，打印对象属性
//    public String toString(){
////        return "Person{name='"+name+'\''+",age="+age+"}";
////    }


//    @Override
//    public String toString() {
//        return "Person{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                '}';
//    }

    /*

    Object类的equals方法，默认比较的是两个对象的地址值，没有意义
    所以我们要重写equals方法，比较两个对象的属性(name,age)
    问题：
        隐含着一个多态：
        多态的弊端：无法使用子类特有的内容（属性和方法）
        Object obj = p2 = new Person("p2",11);
        解决：可以使用向下转型(强转)把obj类型转换为Person类型即可
     */
//        public boolean equals(Object obj){
//            // 传递参数obj如果是this本身，直接返回true
//            if(this == obj){
//                return true;
//            }
//            // 增加一个判断，如果传入参数为null直接返回false
//            if(obj==null){
//                return false;
//            }
//            // 增加一个判断，防止类型转换异常
//            if(obj instanceof Person){
//                // 使用向下转型，把obj转换为Person类型，就可以使用Person中的属性和方法了
//                Person p = (Person)obj;
//                //比较两个对象的属性，一个对象是this(p1),一个对象是p(obj就是p2)
//                return this.name.equals(p.name) && this.age == p.age; // 判断两个对象name属性值和age属性值是否都一致
//            }
//
//            return false; // 不是Person类型，直接返回false
//        }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        // 如果o不等于空并且o不等于Person类型，返回false。 getClass() != o.getClass()  使用反射技术，判断o是否是Person类型， 等效于 obj instanceof Person
        if (o == null || getClass() != o.getClass()) return false;
        // 向下转型
        Person person = (Person) o;
        /* Object.equals(Object a, Object b); equals方法重载解析：
        Objects.equals(name, person.name); // 传入两个对象参数
        public static boolean equals(Object a, Object b) {
            // 判断a==b 或者 a不等于空，并且a与b的内存地址相同，则返回true
            return (a == b) || (a != null && a.equals(b));
        }
         */
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }


}
