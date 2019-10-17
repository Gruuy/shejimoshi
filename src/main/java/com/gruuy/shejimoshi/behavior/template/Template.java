package com.gruuy.shejimoshi.behavior.template;

/**
 * @author: Gruuy
 * @remark: 算法抽象
 * @date: Create in 10:24 2019/10/15
 */
public abstract class Template {

    /** 整体的算法框架（默认方法） */
    void Calculation(){
        abstractMethod();
    }
    /** 不变的  公共的部分 */
    void abstractMethod(){
        System.out.println("抽象类组件被调用" );
        sonMethod1();
        sonMethod2();
    }
    /** 需要子类自己定制的部分 */
    abstract void sonMethod1();
    abstract void sonMethod2();
}
