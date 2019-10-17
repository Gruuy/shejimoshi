package com.gruuy.shejimoshi.structure.Flyweight;

/**
 * @author: Gruuy
 * @remark: 具体享元对象1
 * @date: Create in 15:17 2019/10/14
 */
public class TargetObject1 implements TargetObject {
    private String str;
    private NoFlyObject noFlyObject;

    public TargetObject1(String str,NoFlyObject noFlyObject) {
        this.str = str;
        this.noFlyObject=noFlyObject;
    }

    @Override
    public void say(){
        System.out.println("TargetObject1："+str );
        noFlyObject.say();
    }
}
