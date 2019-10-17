package com.gruuy.shejimoshi.structure.Flyweight;

/**
 * @author: Gruuy
 * @remark: 不享元的对象
 * @date: Create in 15:20 2019/10/14
 */
public class NoFlyObject {
    private static int count=0;
    void say(){
        count++;
        System.out.println(count );
    }
}
