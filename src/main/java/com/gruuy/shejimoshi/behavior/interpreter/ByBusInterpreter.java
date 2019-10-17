package com.gruuy.shejimoshi.behavior.interpreter;

/**
 * @author: Gruuy
 * @remark: 非终结符表达式
 * @date: Create in 10:29 2019/10/17
 */
public class ByBusInterpreter implements Interpreter {
    /** 非终结符表达式需要声明它的树 */
    private Interpreter cityInterpreter;
    private Interpreter humanInterpreter;

    /** 构造注入 */
    public ByBusInterpreter(Interpreter cityInterpreter, Interpreter humanInterpreter) {
        this.cityInterpreter = cityInterpreter;
        this.humanInterpreter = humanInterpreter;
    }

    @Override
    public boolean interpret(String info) {
        //用“的”分割
        String[] s=info.split("的");
        //分别传递到不同的终结符表达式
        return cityInterpreter.interpret(s[0])&&humanInterpreter.interpret(s[1]);
    }
}
