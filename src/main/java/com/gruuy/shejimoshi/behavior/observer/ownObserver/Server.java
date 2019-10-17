package com.gruuy.shejimoshi.behavior.observer.ownObserver;

/**
 * @author: Gruuy
 * @remark: 实现的被观察者
 * @date: Create in 10:21 2019/10/16
 */
public class Server extends Observer{

    @Override
    public void sendMessage() {
        for(ObClient o:obClientList){
            o.update(str);
        }
    }
}
