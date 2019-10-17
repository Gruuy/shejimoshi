package com.gruuy.shejimoshi.structure.adapter;

/**
 * @author: Gruuy
 * @remark:
 * @date: Create in 10:51 2019/10/14
 */
public class TestAdapter {
    private Target target;

    public TestAdapter(Target target) {
        this.target = target;
    }

    public void request(){
        target.say();
    }

    public static void main(String[] args){
        TestAdapter testAdapter=new TestAdapter(new Target2());
        testAdapter.request();
    }
}

class Target1 implements Target{

    @Override
    public void say() {
        System.out.println("This is Target1!" );
    }
}

class Target2 implements Target{
    @Override
    public void say() {
        System.out.println("This is Target2!" );
    }
}