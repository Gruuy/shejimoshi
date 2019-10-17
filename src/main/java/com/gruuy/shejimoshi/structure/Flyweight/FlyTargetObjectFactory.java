package com.gruuy.shejimoshi.structure.Flyweight;

import java.lang.reflect.Constructor;
import java.util.HashMap;

/**
 * @author: Gruuy
 * @remark: 享元对象的工厂
 * @date: Create in 15:22 2019/10/14
 */
public class FlyTargetObjectFactory {
    private HashMap<String,TargetObject> factoryMap=new HashMap<>();

    public TargetObject getTargetObject(String key) throws NoSuchMethodException {
        TargetObject targetObject=factoryMap.get(key);
        if(targetObject!=null){
            return targetObject;
        }else {
            switch (key){
                case "TargetObject1":{
                    TargetObject1 targetObject1 = new TargetObject1("1",new NoFlyObject());
                    factoryMap.put("TargetObject1",targetObject1);
                    return targetObject1;
                }
                case "TargetObject2":{
                    TargetObject2 targetObject2 = new TargetObject2("1",new NoFlyObject());
                    factoryMap.put("TargetObject2",targetObject2);
                    return targetObject2;
                }
                default:
                    return null;
            }
        }
    }
}
