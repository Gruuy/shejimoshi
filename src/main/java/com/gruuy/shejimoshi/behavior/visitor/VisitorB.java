package com.gruuy.shejimoshi.behavior.visitor;

/**
 * @author: Gruuy
 * @remark:
 * @date: Create in 15:48 2019/10/16
 */
public class VisitorB implements Visitor {
    @Override
    public void visitA(ElementA elementA) {
        System.out.print("具体访问者B访问：");
        elementA.operatingA();
    }

    @Override
    public void visitB(ElementB elementB) {
        System.out.print("具体访问者B访问：");
        elementB.operatingB();
    }
}
