package com.gruuy.shejimoshi.create.AbstrectFactory;

/**
 * @author: Gruuy
 * @remark:
 * @date: Create in 15:31 2019/10/12
 */
public class ChinaFactory implements AbstractFactory{
    @Override
    public Car getCar() {
        return new TOYOTA();
    }

    @Override
    public Tank getTank() {
        return new NineNineA();
    }
}
