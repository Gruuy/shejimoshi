package com.gruuy.shejimoshi.behavior.responsibility;

/**
 * @author: Gruuy
 * @remark:
 * @date: Create in 14:58 2019/10/15
 */
public class Handler1 extends Handler {
    @Override
    void handlerRequest() {
        if(message.equals("1")){
            System.out.println("Handler1 处理message！" );
        }else if(handler==null){
            System.out.println("没有处理！" );
        }else if(handler!=null){
            handler.message=this.message;
            handler.handlerRequest();
        }
    }
}
