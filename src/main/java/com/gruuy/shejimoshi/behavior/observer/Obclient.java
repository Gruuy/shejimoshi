package com.gruuy.shejimoshi.behavior.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * @author: Gruuy
 * @remark: 观察者  实现Observer接口  当Observable被修改有通知的时候  它就会触发update方法
 * @date: Create in 10:10 2019/10/16
 */
public class Obclient implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        System.out.println((String)arg );
        //获取有多少个观察者
        System.out.println(o.countObservers());
    }
}
