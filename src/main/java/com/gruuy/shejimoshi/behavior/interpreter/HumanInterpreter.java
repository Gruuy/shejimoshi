package com.gruuy.shejimoshi.behavior.interpreter;

import java.util.HashSet;
import java.util.Set;

/**
 * @author: Gruuy
 * @remark: 终结符表达式
 * @date: Create in 10:25 2019/10/17
 */
public class HumanInterpreter implements Interpreter {
    /** 专门放人类型的set */
    private Set<String> set=new HashSet<>();

    /** 构造器传入String数组  把人类型字符串数组转成set */
    public HumanInterpreter(String[] strs) {
        for(int i=0;i<strs.length;i++){
            set.add(strs[i]);
        }
    }

    /** 判断是否存在 */
    @Override
    public boolean interpret(String info) {
        if(set.contains(info)){
            return true;
        }
        return false;
    }
}
