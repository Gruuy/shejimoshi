package com.gruuy.shejimoshi.create.buliding.entity;

import com.gruuy.shejimoshi.create.buliding.service.Worker;

/**
 * @author: Gruuy
 * @remark:
 * @date: Create in 17:49 2019/10/12
 */
public class Python implements Worker {
    @Override
    public void work() {
        System.out.println("python" );
    }
}
