package com.gruuy.shejimoshi.create.AbstrectFactory;

/**
 * @author: Gruuy
 * @remark:
 * @date: Create in 15:31 2019/10/12
 */
public class Main {
    public static void main(String[] args){
        DODGE dodge= (DODGE) new OtherFactory().getCar();
        Maus maus= (Maus) new OtherFactory().getTank();
        dodge.setDisplacement(6.2);
        dodge.say();
        maus.setWeight(180);
        maus.say();
        TOYOTA toyota= (TOYOTA) new ChinaFactory().getCar();
        NineNineA nineNineA= (NineNineA) new ChinaFactory().getTank();
        toyota.setDisplacement(2.0);
        toyota.say();
        nineNineA.setHeight(3);
        nineNineA.setWeight(5);
        nineNineA.say();
    }
}
