package com.gruuy.shejimoshi.structure.proxy;

/**
 * @author: Gruuy
 * @remark:
 * @date: Create in 10:31 2019/10/14
 */
public class Main {
    public static void main(String[] args){
        DriverProxy driverProxy=new DriverProxy();
        driverProxy.setCar(new DODGE());
        driverProxy.driverCar();
    }
}
