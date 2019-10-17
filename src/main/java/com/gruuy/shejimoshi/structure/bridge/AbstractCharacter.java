package com.gruuy.shejimoshi.structure.bridge;

/**
 * @author: Gruuy
 * @remark:
 * @date: Create in 11:35 2019/10/14
 */
public abstract class AbstractCharacter {
    protected Target target;
    protected AbstractCharacter(Target target){
        this.target=target;
    }
    public abstract void run();
}