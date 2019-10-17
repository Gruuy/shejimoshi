package com.gruuy.shejimoshi.behavior.interpreter;

import java.util.HashSet;
import java.util.Set;

/**
 * @author: Gruuy
 * @remark: 终结符表达式
 * @date: Create in 10:17 2019/10/17
 */
public class CityInterpreter implements Interpreter{
    /** 用于记录市 */
    private Set<String> set=new HashSet<>();
    /** 构造传入字符串数组  循环插入set */
    public CityInterpreter(String[] strs){
        for(int i=0;i<strs.length;i++){
            set.add(strs[i]);
        }
    }
    /** 如果存在返回true  不存在返回false */
    @Override
    public boolean interpret(String info) {
        if(set.contains(info)){
            return true;
        }
        return false;
    }
}
