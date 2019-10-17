package com.gruuy.shejimoshi.create.buliding;

import com.gruuy.shejimoshi.create.buliding.entity.WorkBuliding;

/**
 * @author: Gruuy
 * @remark:
 * @date: Create in 17:53 2019/10/12
 */
public class Main {
    public static void main(String[] args){
        WorkBuliding java=WorkBuliding.getJava();
        WorkBuliding python=WorkBuliding.getPython();
        java.work();
        python.work();
    }
}
