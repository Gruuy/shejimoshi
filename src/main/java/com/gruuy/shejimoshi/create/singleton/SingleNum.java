package com.gruuy.shejimoshi.create.singleton;

import java.io.Serializable;

/**
 * @author: Gruuy
 * @remark:
 * @date: Create in 18:01 2019/10/10
 */
public enum SingleNum implements Serializable {
    instance;

    Object object=new Object();

    public Object getObject(){
        return object;
    }
}
