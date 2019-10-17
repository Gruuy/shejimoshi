package com.gruuy.shejimoshi.behavior.order;

/**
 * @author: Gruuy
 * @remark: 实际命令
 * @date: Create in 11:49 2019/10/15
 */
public class Move extends Order {
    @Override
    public void execute() {
        g.move();
    }
}
