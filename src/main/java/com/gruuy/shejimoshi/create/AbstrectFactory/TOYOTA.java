package com.gruuy.shejimoshi.create.AbstrectFactory;

/**
 * @author: Gruuy
 * @remark:
 * @date: Create in 15:21 2019/10/12
 */
public class TOYOTA implements Car {
    private double displacement;

    @Override
    public void say() {
        System.out.println("TOYOTA is "+displacement+"L!" );
    }

    public double getDisplacement() {
        return displacement;
    }

    public void setDisplacement(double displacement) {
        this.displacement = displacement;
    }
}
