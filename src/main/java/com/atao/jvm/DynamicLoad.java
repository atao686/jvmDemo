package com.atao.jvm;

/**
 * @Description
 * @Author atao
 * @Date 2022/10/1
 */
public class DynamicLoad {

    static {
        System.out.println("-------------加载 DynamicLoad-----------------");
    }

    public static void main(String[] args) {
        new A();
        System.out.println("-------------加载 main-----------------");
        B b = null;
    }

}

class A {
    static {
        System.out.println("-------------加载 A-----------------");
    }

    public A() {
        System.out.println("-------------初始化 A-----------------");
    }
}

class B {
    static {
        System.out.println("-------------加载 B-----------------");
    }

    public B() {
        System.out.println("-------------初始化 B-----------------");
    }
}
