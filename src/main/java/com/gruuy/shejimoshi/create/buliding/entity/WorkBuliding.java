package com.gruuy.shejimoshi.create.buliding.entity;

import com.gruuy.shejimoshi.create.buliding.service.Factory;

/**
 * @author: Gruuy
 * @remark:
 * @date: Create in 17:51 2019/10/12
 */
public class WorkBuliding {
    private Factory factory;

    public static WorkBuliding getJava(){
        WorkBuliding workBuliding=new WorkBuliding();
        workBuliding.setFactory(new JavaFactory());
        return workBuliding;
    }
    public static WorkBuliding getPython(){
        WorkBuliding workBuliding=new WorkBuliding();
        workBuliding.setFactory(new PythonFactory());
        return workBuliding;
    }
    public void work(){
        factory.talkToWork();
    }

    public Factory getFactory() {
        return factory;
    }

    public void setFactory(Factory factory) {
        this.factory = factory;
    }
}
