package com.gruuy.shejimoshi.create.AbstrectFactory;

/**
 * @author: Gruuy
 * @remark:
 * @date: Create in 15:23 2019/10/12
 */
public class Maus implements Tank{
    private double weight;

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public void say() {
        System.out.println("Maus is "+weight+"T!" );
    }
}
