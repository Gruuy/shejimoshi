package com.gruuy.shejimoshi.behavior.mediator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author: Gruuy
 * @remark: 中介者类
 * @date: Create in 10:51 2019/10/16
 */
public class Mediator {
    private Map<String,Colleague> colleagueList=new HashMap<>();
    private static Mediator mediator=new Mediator();
    public void add(Colleague colleague){
        this.colleagueList.put(colleague.getClass().getCanonicalName(),colleague);
    }
    public void remove(Colleague colleague){
        this.colleagueList.remove(colleague.getClass().getCanonicalName());
    }
    public void send(Class<?> clazz,String msg){
        if(Colleague.class.isAssignableFrom(clazz)) {
            Colleague colleague1 = colleagueList.get(clazz.getCanonicalName( ));
            if(colleague1!=null) {
                colleague1.register(msg);
                return;
            }
        }
        System.out.println("没有这个服务！" );
    }
    private Mediator(){}

    public static Mediator getMediator(){
        return mediator;
    }
}
