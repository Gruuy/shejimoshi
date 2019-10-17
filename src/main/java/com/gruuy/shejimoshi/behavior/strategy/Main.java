package com.gruuy.shejimoshi.behavior.strategy;

/**
 * @author: Gruuy
 * @remark:
 * @date: Create in 11:11 2019/10/15
 */
public class Main {
    public static void main(String[] args){
        Scenes scenes=new Scenes(new Car());
        scenes.goPlay();
    }
}
