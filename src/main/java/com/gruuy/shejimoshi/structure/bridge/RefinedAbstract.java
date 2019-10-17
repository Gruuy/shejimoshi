package com.gruuy.shejimoshi.structure.bridge;

/**
 * @author: Gruuy
 * @remark:
 * @date: Create in 11:36 2019/10/14
 */
public class RefinedAbstract extends AbstractCharacter {
    protected RefinedAbstract(Target target) {
        super(target);
    }

    @Override
    public void run() {
        System.out.println("扩展抽象化角色访问" );
        target.say();
    }
}
