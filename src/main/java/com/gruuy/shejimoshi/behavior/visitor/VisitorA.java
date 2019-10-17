package com.gruuy.shejimoshi.behavior.visitor;

/**
 * @author: Gruuy
 * @remark: 具体访问者A
 * @date: Create in 15:46 2019/10/16
 */
public class VisitorA implements Visitor {
    @Override
    public void visitA(ElementA elementA) {
        System.out.print("具体访问者A访问：");
        elementA.operatingA();
    }

    @Override
    public void visitB(ElementB elementB) {
        System.out.print("具体访问者A访问：");
        elementB.operatingB();
    }
}
