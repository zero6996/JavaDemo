package com.zero.demo.Demo4_22;

public class InnerClassDemo03 {
    public static void main(String[] args) {
        Other.Inner obj = new Other().new Inner();
        obj.methodInner();
    }
}
