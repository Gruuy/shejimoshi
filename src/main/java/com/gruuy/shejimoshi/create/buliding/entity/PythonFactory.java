package com.gruuy.shejimoshi.create.buliding.entity;

import com.gruuy.shejimoshi.create.buliding.service.Factory;

/**
 * @author: Gruuy
 * @remark:
 * @date: Create in 17:49 2019/10/12
 */
public class PythonFactory implements Factory {
    @Override
    public void talkToWork() {
        new Python().work();
    }
}
