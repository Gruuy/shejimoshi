package com.gruuy.shejimoshi.structure.decoration;


/**
 * @author: Gruuy
 * @remark: 最终的装饰类
 * @date: Create in 14:28 2019/10/14
 */
public class Decoration extends TestTarget2 {
    /** 利用super实现父类的构造方法 */
    public Decoration(Target target) {
        super(target);
    }
    /** 添加的功能 */
    private void addFunction(){
        System.out.println("我是装饰模式新加的东西" );
    }

    @Override
    public void say() {
        super.say( );
        addFunction();
    }
}
