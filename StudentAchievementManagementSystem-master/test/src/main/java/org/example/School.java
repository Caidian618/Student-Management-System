package org.example;

public class School {
    String name;
    String local;
    String group;
    String level;
    String dsc;
    public School(String name,String local,String group,String level)
    {
      this.name=name;
      this.local=local;
      this.group=group;
      this.level=level;

    }
    public School(String name,String local,String group,String level,String dsc)
    {
//        this.name=name;
        //       this.local=local;
        //       this.group=group;
        //       this.level=level;
        this(name,local,group,level);
        this.dsc=dsc;
    }
public void massage()
{
    System.out.println(name);
    System.out.println(local);
    System.out.println(group);
    System.out.println(level);
}
    public static void main(String[] args) {
        School sc=new School("北京信息科技大学","北京","学生","985");
        School sc1=new School("北京大学","云南","老师","双非","优质大学");
        sc.massage();
        sc1.massage();;

    }
}

