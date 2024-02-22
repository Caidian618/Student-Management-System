package org.example.test;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        System.out.println("请问您要连接那个数据库（1：MySQL数据库，2：Oracal数据库）：");
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        IDAO myq;
        if(n==1)
        {
            myq=new MysqlDao();
        }else
        {
            myq=new OracalDao();
        }
   myq.connect();
        myq.add();
        myq.del();
        myq.sel();
        myq.upd();
    }
}
