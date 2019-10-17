package com.gruuy.shejimoshi.behavior.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * @author: Gruuy
 * @remark:
 * @date: Create in 10:12 2019/10/16
 */
public class Obclient2 implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        System.out.println((String)arg +"2");
        System.out.println(o.countObservers() );
    }
}
