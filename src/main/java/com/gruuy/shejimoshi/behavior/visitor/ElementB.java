package com.gruuy.shejimoshi.behavior.visitor;

/**
 * @author: Gruuy
 * @remark: 具体元素B
 * @date: Create in 15:43 2019/10/16
 */
public class ElementB implements Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visitB(this);
    }

    public void operatingB(){
        System.out.println("访问B" );
    }
}
