package com.gruuy.shejimoshi.create.FactoryMethod;

/**
 * @author: Gruuy
 * @remark:
 * @date: Create in 15:02 2019/10/12
 */
public class CircleFactory implements AbstractFactory {
    @Override
    public AbstractObject getObject() {
        return new Circle();
    }
}
