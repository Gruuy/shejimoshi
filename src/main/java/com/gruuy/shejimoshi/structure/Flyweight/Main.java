package com.gruuy.shejimoshi.structure.Flyweight;

/**
 * @author: Gruuy
 * @remark:
 * @date: Create in 15:30 2019/10/14
 */
public class Main {
    public static void main(String[] args) throws NoSuchMethodException {
        FlyTargetObjectFactory factory=new FlyTargetObjectFactory();
        TargetObject targetObject1 = factory.getTargetObject("TargetObject1");
        targetObject1.say();
        System.out.println(targetObject1);
        TargetObject targetObject2 = factory.getTargetObject("TargetObject2");
        targetObject2.say();
        System.out.println(targetObject2);


        TargetObject targetObject3 = factory.getTargetObject("TargetObject1");
        targetObject3.say();
        System.out.println(targetObject3);
        TargetObject targetObject4 = factory.getTargetObject("TargetObject2");
        targetObject4.say();
        System.out.println(targetObject4);
    }
}
