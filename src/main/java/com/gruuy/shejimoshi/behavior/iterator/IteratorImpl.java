package com.gruuy.shejimoshi.behavior.iterator;


import java.util.List;

/**
 * @author: Gruuy
 * @remark: 迭代器实现
 * @date: Create in 14:49 2019/10/16
 */
public class IteratorImpl implements Iterator {
    private List<Object> objectList;
    private int index=-1;
    public IteratorImpl(List<Object> list){
        this.objectList=list;
    }

    @Override
    public boolean hasNext() {
        if(objectList.size()>(index+1)) {
            return true;
        }
        return false;
    }

    @Override
    public Object first() {
        index=0;
        if(objectList.size()>0) {
            return objectList.get(index);
        }
        return null;
    }

    @Override
    public Object next() {
        index++;
        if(objectList.size()>index) {
            return objectList.get(index);
        }
        return null;
    }
}
