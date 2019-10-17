package com.gruuy.shejimoshi.behavior.status;

/**
 * @author: Gruuy
 * @remark:
 * @date: Create in 15:38 2019/10/15
 */
public class Status1 implements Status {
    @Override
    public void handler(Context context) throws Exception {
        System.out.println("Now status is 1" );
        context.setStatus(context.getStatus(Status2.class));
    }
}
