package com.gruuy.shejimoshi.behavior.responsibility;

/**
 * @author: Gruuy
 * @remark:
 * @date: Create in 14:55 2019/10/15
 */
public abstract class Handler {
    public String message;
    protected Handler handler;
    void setHandler(Handler handler){
        this.handler=handler;
    }
    abstract void handlerRequest();
}
