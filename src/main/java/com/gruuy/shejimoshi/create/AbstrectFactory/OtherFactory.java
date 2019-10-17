package com.gruuy.shejimoshi.create.AbstrectFactory;

/**
 * @author: Gruuy
 * @remark:
 * @date: Create in 15:27 2019/10/12
 */
public class OtherFactory implements AbstractFactory{

    @Override
    public Car getCar() {
        return new DODGE();
    }

    @Override
    public Tank getTank() {
        return new Maus();
    }
}
