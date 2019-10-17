package com.gruuy.shejimoshi.structure.decoration;

/**
 * @author: Gruuy
 * @remark:
 * @date: Create in 14:30 2019/10/14
 */
public class Main {
    public static void main(String[] args){
        Target target=new Decoration(new TestTarget());
        target.say();
    }
}
