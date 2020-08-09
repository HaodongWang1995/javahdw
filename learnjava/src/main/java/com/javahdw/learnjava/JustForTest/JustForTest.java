package com.javahdw.learnjava.JustForTest;

public class JustForTest {
    static{
        System.out.println("静态代码块");
    }
    {
        System.out.println("构造代码块1");
    }
    {
        System.out.println("构造代码块2");
    }
    JustForTest(){
        System.out.println("构造函数1");
    }
    JustForTest(int a){
        System.out.println("构造函数2");
    }

    public static void main(String[] args) {
        System.out.println("1");
        JustForTest test = new JustForTest();
        JustForTest test2 = new JustForTest(1);
        System.out.println("1");

    }
}
