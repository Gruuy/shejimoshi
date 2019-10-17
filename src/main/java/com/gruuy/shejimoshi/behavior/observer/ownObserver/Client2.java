package com.gruuy.shejimoshi.behavior.observer.ownObserver;

/**
 * @author: Gruuy
 * @remark:
 * @date: Create in 10:23 2019/10/16
 */
public class Client2 implements ObClient {
    @Override
    public void update(Object obj) {
        System.out.println(obj.toString()+" this is Client2!" );
    }
}
