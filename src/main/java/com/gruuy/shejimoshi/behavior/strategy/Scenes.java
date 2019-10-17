package com.gruuy.shejimoshi.behavior.strategy;


/**
 * @author: Gruuy
 * @remark: 场景类
 * @date: Create in 11:10 2019/10/15
 */
public class Scenes {
    private Strategy entity;

    public Scenes(Strategy entity) {
        this.entity = entity;
    }

    public void goPlay(){
        entity.goMethod();
    }
}
