package com.gruuy.shejimoshi.create.FactoryMethod;

/**
 * @author: Gruuy
 * @remark:
 * @date: Create in 14:54 2019/10/12
 */
public class Circle implements AbstractObject {
    private double r;
    @Override
    public double getArea() {
        return Math.PI*r*r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }
}
