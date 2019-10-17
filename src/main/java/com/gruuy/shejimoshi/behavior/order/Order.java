package com.gruuy.shejimoshi.behavior.order;

/**
 * @author: Gruuy
 * @remark: 命令抽象
 * @date: Create in 11:48 2019/10/15
 */
public abstract class Order {
    Geter g;
    abstract void execute();

    public void setGeter(Geter entity){
        g=entity;
    }
}
