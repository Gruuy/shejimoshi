package com.gruuy.shejimoshi.behavior.iterator;

import java.util.ArrayList;

/**
 * @author: Gruuy
 * @remark:
 * @date: Create in 14:59 2019/10/16
 */
public class Main {
    public static void main(String[] args){
        AbstractAgg agg=new Agg();
        agg.add("wdnmd");
        agg.add("cnm");
        agg.add("nmsl");
        new ArrayList().iterator();
        Iterator iterator = agg.getIterator( );
        while (iterator.hasNext()){
            System.out.println(iterator.next() );
        }
    }
}
