package org.example.equal;

public class Cat {
    String name;
    String color;
    public  Cat(String name,String color)
    {
        this.color=color;
        this.name=name;
    }


    public boolean equals(Cat  a)
    {

        if(this.color == a.color)
        {
            return true;
        }else
            return false;
    }

    public static void main(String[] args) {
        Cat c1=new Cat("小菊","白色");
        Cat c2=new Cat("小兰","黑色");

        System.out.println(c1.equals(c2));
    }



}
