package com.gruuy.shejimoshi.behavior.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: Gruuy
 * @remark:
 * @date: Create in 14:57 2019/10/16
 */
public class Agg extends AbstractAgg<Object> {
    private List<Object> objectList=new ArrayList<>();
    @Override
    void add(Object obj) {
        objectList.add(obj);
    }

    @Override
    void remove(Object obj) {
        objectList.remove(obj);
    }

    @Override
    Iterator getIterator() {
        return new IteratorImpl(objectList);
    }
}
