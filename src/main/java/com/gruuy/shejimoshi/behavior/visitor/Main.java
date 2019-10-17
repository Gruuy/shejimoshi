package com.gruuy.shejimoshi.behavior.visitor;

/**
 * @author: Gruuy
 * @remark:
 * @date: Create in 15:39 2019/10/16
 */
public class Main {
    public static void main(String[] args){
        ObjectStruct objectStruct=new ObjectStruct();
        objectStruct.add(new ElementA());
        objectStruct.add(new ElementB());
        objectStruct.accept(new VisitorA());
        objectStruct.accept(new VisitorB());
    }
}
