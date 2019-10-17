package com.gruuy.shejimoshi.structure.composite;

/**
 * @author: Gruuy
 * @remark:
 * @date: Create in 16:26 2019/10/14
 */
public class Main {
    public static void main(String[] args){
        Branch branch=new Branch();
        Leaf l=new Leaf();
        l.name="HASEE";l.count=1;l.price=8100;
        branch.list.add(l);
        Leaf l1=new Leaf();
        l1.name="MI";l1.count=1;l1.price=2699;
        branch.list.add(l1);
        Branch newBag=new Branch();
        Leaf b=new Leaf();
        b.name="鼠标";b.count=1;b.price=29.9;
        Leaf b1=new Leaf();
        b1.name="键盘";b1.count=1;b1.price=10;
        newBag.list.add(b);
        newBag.list.add(b1);
        branch.list.add(newBag);
        branch.show();
        System.out.println(branch.sum( ));
    }
}
