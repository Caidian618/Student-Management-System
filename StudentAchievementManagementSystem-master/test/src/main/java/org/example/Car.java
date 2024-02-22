package org.example;

public class Car {
    String corlor;
    int speed;
    String carname;
    String type;
    public void run( ) {
        System.out.println("车能跑");
    }
    public void fly(String type,String corlor,String carname){
        System.out.println(this.corlor+"颜色的车在"+corlor+"颜色的地面上跑");
        System.out.println(this.type+this.corlor+"的"+this.carname+"比"+type+corlor+"的"+carname+"跑得快");
    }

    public void Carmassage(){
        Car c=new Car();
        c.carname="奥迪";
        c.speed=300;
        c.type="A6L";
        c.corlor="white";
        System.out.println(c.carname);
        System.out.println(c.type);
        System.out.println(c.corlor);
        System.out.println(c.speed);
    }

    public static void main(String[] args) {
        Car c1=new Car();
        c1.Carmassage();
        c1.corlor="黑色";
        c1.type="A8L";
        c1.carname="奥迪";
        c1.run();
        c1.fly("A6L","白色","奥迪");
    }
}
