package com.gruuy.shejimoshi.structure.proxy;

/**
 * @author: Gruuy
 * @remark:
 * @date: Create in 10:30 2019/10/14
 */
public class DriverProxy {
    private AbstractObject car;
    void driverCar(){
        beforeCarSay();
        car.say();
    }
    private void beforeCarSay(){
        System.out.print("Driver " );
    }

    public void setCar(AbstractObject car){
        this.car=car;
    }
}
