package com.gruuy.shejimoshi.behavior.mediator;

import javax.print.attribute.standard.Media;

/**
 * @author: Gruuy
 * @remark:
 * @date: Create in 11:09 2019/10/16
 */
public class Main {
    public static void main(String[] args){
        Mediator m=Mediator.getMediator();
        Colleague colleague1=new Colleague1();
        Colleague colleague2=new Colleague2();
        m.add(colleague1);
        m.add(colleague2);
        colleague1.send(Colleague1.class,"1发送2");
        colleague2.send(Colleague2.class,"2发送1");
    }
}
