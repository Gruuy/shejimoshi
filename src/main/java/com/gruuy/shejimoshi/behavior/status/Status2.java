package com.gruuy.shejimoshi.behavior.status;

/**
 * @author: Gruuy
 * @remark:
 * @date: Create in 15:40 2019/10/15
 */
public class Status2 implements Status {
    @Override
    public void handler(Context context) throws Exception {
        System.out.println("Now status is 2" );
        context.setStatus(context.getStatus(Status1.class));
    }
}
