package com.gruuy.shejimoshi.behavior.iterator;
/**
 * @author: Gruuy
 * @remark: 抽象聚合类
 * @date: Create in 14:45 2019/10/16
 */
public abstract class AbstractAgg<T> {

    abstract void add(T obj);
    abstract void remove(T obj);
    abstract Iterator getIterator();

}
