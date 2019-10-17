package com.gruuy.shejimoshi.create.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author: Gruuy
 * @remark:
 * @date: Create in 9:17 2019/10/11
 */
public class Main2 {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Object object=SingleNum.instance.getObject();
        Object object2=SingleNum.instance.getObject();
        System.out.println(object );
        System.out.println(object2 );

        Class clazz=SingleNum.class;
        //获取构造方法
        Constructor cons=clazz.getDeclaredConstructor();
        //强制使用private  取消 Java 语言访问检查
        cons.setAccessible(true);
        //利用构造方法创建对象
        Object boomSingle= cons.newInstance();
        System.out.println(boomSingle );
    }
}
