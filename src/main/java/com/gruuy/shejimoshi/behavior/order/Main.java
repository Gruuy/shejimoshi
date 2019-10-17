package com.gruuy.shejimoshi.behavior.order;

/**
 * @author: Gruuy
 * @remark: 开始发送
 * @date: Create in 11:58 2019/10/15
 */
public class Main {
    public static void main(String[] args){
        Sender sender=new Sender();
        Geter geter=new Geter();
        Fire fire=new Fire();
        fire.setGeter(geter);
        Move move=new Move();
        move.setGeter(geter);
        sender.add(fire);
        sender.add(move);
        sender.send();
    }
}
