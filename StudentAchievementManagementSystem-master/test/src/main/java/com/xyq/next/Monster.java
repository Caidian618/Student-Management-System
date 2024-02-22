package com.xyq.next;

public class Monster {
    String name="金钱豹";
    public  void eatPeople()
    {
        System.out.println("Monster eat people");
    }
    public Monster(String name)
    {
        System.out.println("这是Monster（父类）的构造方法");
        this.name=name;
    }
}
