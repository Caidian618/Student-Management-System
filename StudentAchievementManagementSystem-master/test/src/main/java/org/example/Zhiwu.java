package org.example;

public class Zhiwu {
    String name;
    int hp;
    int  attack;
    public Zhiwu(String name, int  hp, int  attack)
    {
        this.name=name;
        this.hp=hp;
        this.attack=attack;
    }
    public void fight(Jiangshi js)
    {
        System.out.println(this.name+"在打"+js.name);
        js.hp-=this.attack;
        System.out.println(js.name+"的血量还剩"+js.hp);
    }
}
