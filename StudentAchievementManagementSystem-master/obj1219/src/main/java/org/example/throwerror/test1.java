package org.example.throwerror;

import java.io.File;
import java.io.FileInputStream;
import  java.io.InputStream;
public class test1 {
    public static void chu(int a, int b) throws Exception{
        if (b == 0) {
            throw new Exception("除法算数逻辑中，分母不能为0");
        } else {
            System.out.println(a/b);
        }

        public static void main(String[] args) {
            try
            {
                chu(4, 0);
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }
    }
}
