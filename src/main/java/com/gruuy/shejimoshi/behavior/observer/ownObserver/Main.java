package com.gruuy.shejimoshi.behavior.observer.ownObserver;

/**
 * @author: Gruuy
 * @remark:
 * @date: Create in 10:24 2019/10/16
 */
public class Main {
    public static void main(String[] args){
        Observer o=new Server();
        ObClient obClient=new Client1();
        ObClient obClient1=new Client2();
        o.add(obClient);
        o.add(obClient1);
        o.setStr("123");
    }
}
