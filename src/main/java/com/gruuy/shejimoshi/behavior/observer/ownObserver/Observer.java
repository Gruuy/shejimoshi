package com.gruuy.shejimoshi.behavior.observer.ownObserver;

import com.gruuy.shejimoshi.behavior.observer.Obclient;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: Gruuy
 * @remark: 自己手动实现观察者
 * @date: Create in 10:16 2019/10/16
 */
public abstract class Observer {
    protected List<ObClient> obClientList=new ArrayList<>();
    protected String str;

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
        sendMessage();
    }
    public void add(ObClient obclient){
        obClientList.add(obclient);
    }
    public void remove(ObClient obClient){
        obClientList.remove(obClient);
    }

    public abstract void sendMessage();
}
