package ZeroDemos.Demo4_25;


import java.util.LinkedList;


public class Demo02LinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.addFirst(0);
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        System.out.println(list); // [0,1,2,3]
        System.out.println("返回此列表第一个元素:"+list.getFirst()); // 0
        System.out.println("返回此列表最后一个元素:"+list.getLast()); // 3
        System.out.println("删除第一个元素并返回它:"+list.removeFirst()); // 0
        System.out.println("删除最后一个元素并返回它:"+list.removeLast()); // 3
        System.out.println(list.pop()); // 弹出，就是移除元素,栈在列表左侧
        list.push(3);
        System.out.println(list);
        System.out.println(list.isEmpty()); // 判断列表是否为空，空则返回true
    }
}
