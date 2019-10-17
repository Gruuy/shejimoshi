package com.gruuy.shejimoshi.behavior.visitor;

/**
 * @author: Gruuy
 * @remark: 抽象访问者
 * @date: Create in 15:39 2019/10/16
 */
public interface Visitor {
    void visitA(ElementA elementA);
    void visitB(ElementB elementB);
}
