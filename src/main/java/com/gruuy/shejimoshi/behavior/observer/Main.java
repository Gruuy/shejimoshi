package com.gruuy.shejimoshi.behavior.observer;

/**
 * @author: Gruuy
 * @remark:
 * @date: Create in 10:06 2019/10/16
 */
public class Main {
    public static void main(String[] args){
        Observer o=new Observer();
        o.addObserver(new Obclient2());
        o.addObserver(new Obclient());
        o.setStr("123");
    }
}
