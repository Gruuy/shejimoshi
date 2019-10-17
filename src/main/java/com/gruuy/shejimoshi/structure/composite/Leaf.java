package com.gruuy.shejimoshi.structure.composite;

/**
 * @author: Gruuy
 * @remark: 叶子
 * @date: Create in 16:15 2019/10/14
 */
public class Leaf implements Component {
    public String name;
    public double price;
    public int count;

    @Override
    public void show() {
        System.out.print(name+"    ");
        System.out.println(price+"$"+"   "+count+"个" );
    }

    @Override
    public double sum() {
        return price*count;
    }
}
