/*
定义一个方法的格式：
public static void 方法名称（）{
	方法体
}
方法名称的命名规则和变量一样，使用小驼峰
方法体：也就是大括号当中可以包含任意条语句 

注意事项：
1. 方法定义的先后顺序无所谓。
2. 方法的定义不能产生嵌套包含关系。
3. 方法定义好后不会执行，如想要执行，一定要进行方法的调用

如何调用方法，格式：
方法名称（）；
 */
public class Method01 {
	public static void main(String[] args) {
		farmer();
		seller();
		cook();
		human();
	}
	// 农民
	public static void farmer() {
		System.out.println("农民方法");
	}
	// 小商贩
	public static void seller() {
		System.out.println("小商贩方法");
	}
	// 厨师
	public static void cook() {
		System.out.println("厨师方法");
	}
	//人类
	public static void human() {
		System.out.println("人吃方法");
	}
}
