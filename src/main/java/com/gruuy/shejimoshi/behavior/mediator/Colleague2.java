package com.gruuy.shejimoshi.behavior.mediator;

/**
 * @author: Gruuy
 * @remark:
 * @date: Create in 11:07 2019/10/16
 */
public class Colleague2 implements Colleague {
    @Override
    public void register(String msg) {
        System.out.println("Colleague2 write:"+msg );
    }

    @Override
    public void send(Class<?> clazz, String msg) {
        mediator.send(clazz,msg);
    }
}
