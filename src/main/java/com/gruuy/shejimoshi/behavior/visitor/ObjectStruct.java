package com.gruuy.shejimoshi.behavior.visitor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author: Gruuy
 * @remark: 对象结构（最后的对象）
 * @date: Create in 15:50 2019/10/16
 */
public class ObjectStruct {
    private List<Element> elementList=new ArrayList<>();

    public void accept(Visitor visitor)
    {
        Iterator<Element> i=elementList.iterator();
        while(i.hasNext())
        {
            i.next().accept(visitor);
        }
    }

    public void add(Element element)
    {
        elementList.add(element);
    }

    public void remove(Element element)
    {
        elementList.remove(element);
    }
}
