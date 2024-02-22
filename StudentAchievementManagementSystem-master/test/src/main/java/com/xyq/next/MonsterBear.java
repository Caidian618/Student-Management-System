package com.xyq.next;

public class MonsterBear extends Monster{
    String name="黑熊怪";;
    public MonsterBear()
    {
        super("金角大王");
        System.out.println(super.name);
        System.out.println("这是MonsterBear(子类)的构造方法");
    }
public void eat()
{
   // MonsterBear blkBe= new MonsterBear();
   // blkBe.name="黑熊怪";
    System.out.println(super.name+"在发钱");
    System.out.println(this.name+"在吃人");
}
    public  void eatPeople()
    {
        System.out.println("MonsterBear eat people");
    }

    public static void main(String[] args) {
        MonsterBear B=new MonsterBear();

        B.eatPeople();
    }
}
