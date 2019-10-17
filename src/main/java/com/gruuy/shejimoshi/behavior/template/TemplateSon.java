package com.gruuy.shejimoshi.behavior.template;

/**
 * @author: Gruuy
 * @remark: 子类实现  重写父类定义好的可定制部分
 * @date: Create in 10:41 2019/10/15
 */
public class TemplateSon extends Template {
    @Override
    void sonMethod1() {
        System.out.println("现在是需要定制的部分Son1" );
    }

    @Override
    void sonMethod2() {
        System.out.println("现在是需要定制的部分Son2" );
    }
}
