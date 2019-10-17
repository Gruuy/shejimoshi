package com.gruuy.shejimoshi.behavior.mediator;

/**
 * @author: Gruuy
 * @remark:
 * @date: Create in 11:06 2019/10/16
 */
public class Colleague1 implements Colleague {


    @Override
    public void send(Class<?> clazz, String msg) {
        mediator.send(clazz,msg);
    }

    @Override
    public void register(String msg) {
        System.out.println("Colleague1 write:"+msg );
    }
}
