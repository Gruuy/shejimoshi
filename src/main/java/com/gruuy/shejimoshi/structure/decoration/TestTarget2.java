package com.gruuy.shejimoshi.structure.decoration;

/**
 * @author: Gruuy
 * @remark: 抽象装饰
 * @date: Create in 14:25 2019/10/14
 */
public abstract class TestTarget2 implements Target {
    /**实现与构件同样的接口  让他看起来没区别（都是Target）*/
    private Target target;

    public TestTarget2(Target target) {
        this.target = target;
    }

    @Override
    public void say() {
        target.say();
    }
}
