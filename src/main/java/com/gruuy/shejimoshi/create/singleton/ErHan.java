package com.gruuy.shejimoshi.create.singleton;

import java.io.Serializable;

/**
 * @author: Gruuy
 * @remark:
 * @date: Create in 11:46 2019/10/10
 */
public class ErHan implements Serializable,Cloneable {
    private static final ErHan entity=new ErHan();
    private ErHan(){}

    public static ErHan getEntity(){
        return entity;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone( );
    }
}
