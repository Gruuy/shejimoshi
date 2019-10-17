package com.gruuy.shejimoshi.structure.Facade;

/**
 * @author: Gruuy
 * @remark:
 * @date: Create in 14:54 2019/10/14
 */
public class Facade {
    private Entity1 entity1=new Entity1();
    private Entity2 entity2=new Entity2();
    private Entity3 entity3=new Entity3();

    public void say(){
        entity1.say();
        entity2.say();
        entity3.say();
    }
    public static void main(String[] args){
        Facade facade=new Facade();
        facade.say();
    }
}
