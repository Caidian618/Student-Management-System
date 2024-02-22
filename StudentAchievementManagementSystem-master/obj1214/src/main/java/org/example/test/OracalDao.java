package org.example.test;

public class OracalDao extends AbstractDao {
    public OracalDao() {
        super();
    }

    @Override
    public void connect() {
        System.out.println("Oracal数据库连接");
    }

//    @Override
//    public void add() {
//        System.out.println("Oracal数据库增加");
//    }
//
//    @Override
//    public void del() {
//        System.out.println("Oracal数据库删除");
//    }
//
//    @Override
//    public void upd() {
//        System.out.println("Oracal数据库更新");
//    }
//
//    @Override
//    public void sel() {
//        System.out.println("Oracal数据库选择");
//    }
}
