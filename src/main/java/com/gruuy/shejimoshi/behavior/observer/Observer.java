package com.gruuy.shejimoshi.behavior.observer;

import java.util.Observable;

/**
 * @author: Gruuy
 * @remark: 被观察者（改变后通知所有人）
 * 继承java自带的Observable  默认有实现观察者模式  此类表示是被观察者
 * @date: Create in 10:07 2019/10/16
 */
public class Observer extends Observable {
    private String str;

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
        super.setChanged();
        super.notifyObservers(str);
    }
}
