package org.example.test;

public class Panda extends Animal implements Valuable,Protectable{
    @Override
    public void eat() {
        System.out.println("动物会吃东西");
    }

    @Override
    public void pro() {
        System.out.println("有些动物是国家保护动物");
    }

    @Override
    public void getmoney() {
        System.out.println("国家保护动物很值钱");

    }
}
