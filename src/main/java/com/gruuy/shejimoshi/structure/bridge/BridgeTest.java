package com.gruuy.shejimoshi.structure.bridge;

/**
 * @author: Gruuy
 * @remark:
 * @date: Create in 11:21 2019/10/14
 */
public class BridgeTest
{
    public static void main(String[] args) {
        Target target=new Target1();
        RefinedAbstract refinedAbstract=new RefinedAbstract(target);
        refinedAbstract.run();
    }
}
