package org.example.throwerror;

public class test {
    public static void main(String[] args) {
        try{
            System.out.println(1/0);
        }
        catch(Exception e)
        {
            e.printStackTrace();
          //  System.out.println("所输入的算法逻辑不对，请确认后再输入");
        }
finally {
            System.out.println("谢谢使用，欢迎下次光临");
        }
    }
}
