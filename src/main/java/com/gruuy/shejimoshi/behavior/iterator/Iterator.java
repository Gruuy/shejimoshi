package com.gruuy.shejimoshi.behavior.iterator;

/**
 * @author: Gruuy
 * @remark: 抽象迭代器
 * @date: Create in 14:48 2019/10/16
 */
public interface Iterator {
    boolean hasNext();
    Object first();
    Object next();
}
