package org.example;

public class Clent {
    public static void main(String[] args) {
        Zhiwu zw=new Zhiwu("寒冰射手",1000,10);
        Jiangshi js=new Jiangshi("铁通僵尸",800,5);
        zw.fight(js);
        js.fight(zw);
    }
}
