package com.gruuy.shejimoshi.behavior.order;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: Gruuy
 * @remark: 发送者
 * @date: Create in 11:49 2019/10/15
 */
public class Sender {
    private List<Order> orderList=new ArrayList<>();
    public void add(Order entity){
        orderList.add(entity);
    }
    public void remove(Order entity){
        orderList.remove(entity);
    }
    public void send(){
        orderList.stream().forEach(a->a.execute());
    }
}
