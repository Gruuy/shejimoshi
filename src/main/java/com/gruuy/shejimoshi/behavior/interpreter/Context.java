package com.gruuy.shejimoshi.behavior.interpreter;

/**
 * @author: Gruuy
 * @remark: 环境类
 * @date: Create in 10:40 2019/10/17
 */
public class Context {
    private String[] citys={"韶关","广州"};
    private String[] persons={"老人","妇女","儿童"};
    private Interpreter cityPerson;

    public Context(){
        Interpreter city=new CityInterpreter(citys);
        Interpreter human=new HumanInterpreter(persons);
        cityPerson=new ByBusInterpreter(city,human);
    }

    public void byBuy(String info){
        boolean ok=cityPerson.interpret(info);
        if(ok){
            System.out.println(info+"  本次Free！" );
        }else {
            System.out.println(info+"  付款你妹的！" );
        }
    }
}
