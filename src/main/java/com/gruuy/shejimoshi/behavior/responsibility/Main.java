package com.gruuy.shejimoshi.behavior.responsibility;

/**
 * @author: Gruuy
 * @remark:
 * @date: Create in 15:08 2019/10/15
 */
public class Main {
    public static void main(String[] args){
        Handler handler1=new Handler1();
        Handler handler2=new Handler2();
        handler1.setHandler(handler2);
        handler1.message="2";
        handler1.handlerRequest();
    }
}
