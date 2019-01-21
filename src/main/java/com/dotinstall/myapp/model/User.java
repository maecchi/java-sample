package com.dotinstall.myapp.model;

interface Printable {
    // 定数
    double VERSION = 1.2;
    // 抽象メソッド
    void print();
    // default メソッド
    public default void getInfo() {
        System.out.println("I/F ver." + Printable.VERSION);
    }
    // static メソッド

}

public class User implements Printable {
    protected String name; // フィールド

    // constructor
    /*
    public User(String name) {
        this.name = name;
    }
    */

    public void sayHi() {
        System.out.println("こんにちは！");
    }

    @Override
    public void print() {
        System.out.println("Now printing user profile...");
    }
}


