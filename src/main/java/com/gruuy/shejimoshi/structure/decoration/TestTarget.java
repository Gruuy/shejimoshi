package com.gruuy.shejimoshi.structure.decoration;

/**
 * @author: Gruuy
 * @remark: 抽象构件的实现
 * @date: Create in 14:24 2019/10/14
 */
public class TestTarget implements Target {
    @Override
    public void say() {
        System.out.println("具体say" );
    }
}
