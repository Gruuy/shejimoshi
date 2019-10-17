package com.gruuy.shejimoshi.behavior.responsibility;

/**
 * @author: Gruuy
 * @remark:
 * @date: Create in 15:07 2019/10/15
 */
public class Handler2 extends Handler {
    @Override
    void handlerRequest() {
        if(message.equals("2")){
            System.out.println("Handler2 处理message！" );
        }else if(handler==null){
            System.out.println("没有处理！" );
        }else if(handler!=null){
            handler.message=this.message;
            handler.handlerRequest();
        }
    }
}
