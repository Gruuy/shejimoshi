package com.gruuy.shejimoshi.behavior.visitor;

/**
 * @author: Gruuy
 * @remark: 具体元素A
 * @date: Create in 15:42 2019/10/16
 */
public class ElementA implements Element {

    @Override
    public void accept(Visitor visitor) {
        visitor.visitA(this);
    }

    public void operatingA(){
        System.out.println("访问A" );
    }
}
