package com.gruuy.shejimoshi.behavior.strategy;

/**
 * @author: Gruuy
 * @remark:
 * @date: Create in 11:07 2019/10/15
 */
public class Car implements Strategy{
    @Override
    public void goMethod() {
        System.out.println("Driver Car!" );
    }
}
