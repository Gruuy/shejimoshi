package com.gruuy.shejimoshi.create.buliding.entity;

import com.gruuy.shejimoshi.create.buliding.service.Worker;

/**
 * @author: Gruuy
 * @remark:
 * @date: Create in 17:48 2019/10/12
 */
public class Java implements Worker {
    @Override
    public void work() {
        System.out.println("java" );
    }
}
