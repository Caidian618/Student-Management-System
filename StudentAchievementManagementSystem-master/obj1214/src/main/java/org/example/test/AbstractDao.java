package org.example.test;

public abstract class AbstractDao implements IDAO{
    public AbstractDao() {
        super();
    }

    @Override
    public void add() {
        System.out.println("增加");
    }

    @Override
    public void del() {
        System.out.println("删除");

    }

    @Override
    public void upd() {
        System.out.println("更新");

    }

    @Override
    public void sel() {
        System.out.println("选择");

    }
}
