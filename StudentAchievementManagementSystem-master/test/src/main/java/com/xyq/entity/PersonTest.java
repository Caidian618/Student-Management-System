package com.xyq.entity;

public class PersonTest {
    public static void main(String[] args) {
        Person p=new Person();
        p.setName("彭于晏");
        p.setAge(-35);
        System.out.println(p.getName()+p.getName());
        p.eat();
    }
}
