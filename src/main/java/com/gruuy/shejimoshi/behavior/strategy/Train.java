package com.gruuy.shejimoshi.behavior.strategy;

/**
 * @author: Gruuy
 * @remark:
 * @date: Create in 11:08 2019/10/15
 */
public class Train implements Strategy {
    @Override
    public void goMethod() {
        System.out.println("by train!" );
    }
}
