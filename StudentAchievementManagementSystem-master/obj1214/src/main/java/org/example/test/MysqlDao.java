package org.example.test;

public class MysqlDao extends AbstractDao {
    public MysqlDao() {

    }

    @Override
    public void connect() {
        System.out.println("MySQL数据库连接");
    }

//    @Override
//    public void add() {
//        System.out.println("MySQL增加");
//    }
//
//    @Override
//    public void del() {
//        System.out.println("MySQL删除");
//    }
//
//    @Override
//    public void upd() {
//        System.out.println("MySQL更新");
//    }
//
//    @Override
//    public void sel() {
//        System.out.println("MySQL展示");
//    }
}
