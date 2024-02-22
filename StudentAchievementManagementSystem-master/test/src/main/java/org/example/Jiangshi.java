package org.example;

public class Jiangshi {
    String name;
    int hp;
    int attack;
    public Jiangshi(String name,int hp,int attack)
    {
        this.name=name;
        this.hp=hp;
        this.attack=attack;
    }
    public void fight(Zhiwu zw)
    {
        System.out.println(this.name+"在攻击"+zw.name);
        zw.hp-=this.attack;
        System.out.println(zw.name+"的血量还剩"+zw.hp);
    }
}
