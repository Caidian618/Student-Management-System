package com.xyq.entity;

public class Person {
      String name;
     int age;
    String sex;
    public void eat()
    {
         Person p=new Person();
        System.out.println(this.age+"岁的"+this.name+"在吃波仔面");
    }
    //setter  往里面放值,给成员变量赋值
    public  void setAge(int age)
    {
        if (age<0)
        {
            this.age=0;
        }
        else {
            this.age=age;
        }
    }
    public void setName(String name)
    {
          this.name=name;
    }
    //getter  往外面拿值，从成员变量取值
    public int getAge()
    {
        return this.age;
    }
    public String getName()
    {
        return this.name;
    }
}
