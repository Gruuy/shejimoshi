package com.gruuy.shejimoshi.behavior.visitor;

/**
 * @author: Gruuy
 * @remark: 抽象元素类  方法用于传递不同的访问者    不同的访问者有他们自己不同的访问方式
 * @date: Create in 15:40 2019/10/16
 */
public interface Element {
    void accept(Visitor visitor);
}
