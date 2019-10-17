package com.gruuy.shejimoshi.behavior.mediator;

/**
 * @author: Gruuy
 * @remark:
 * @date: Create in 10:57 2019/10/16
 */
public interface Colleague {
    Mediator mediator = Mediator.getMediator();

    void register(String msg);

    void send(Class<?> clazz,String msg);

}
