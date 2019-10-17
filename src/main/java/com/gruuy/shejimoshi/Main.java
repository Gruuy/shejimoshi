package com.gruuy.shejimoshi;

import java.util.Arrays;
import java.util.List;

/**
 * @author: Gruuy
 * @remark:
 * @date: Create in 17:53 2019/10/14
 */
public class Main {
    public static void main(String[] args){
        List<Integer> numList = Arrays.asList(Integer.MAX_VALUE,Integer.MAX_VALUE);
        long result = numList.stream().reduce(0L,(a,b) ->  a + b, (a,b)-> 0L );
        System.out.println(result);
    }
}
