package com.gruuy.shejimoshi.create.singleton;

/**
 * @author: Gruuy
 * @remark:
 * @date: Create in 11:43 2019/10/10
 */
public class LanHan {
    public static volatile LanHan entity=null;
    private static boolean flag=true;
    private LanHan() throws Exception {
        if(flag){
            flag=false;
        }else {
            throw new Exception("single is fighting!");
        }
    }

    public static synchronized LanHan getEntity() throws Exception {
        if(entity==null){
            entity=new LanHan();
        }
        return entity;
    }

    //在单例类中添加readResolve()方法
    //每当JVM从文件中向内存反序列化新建一个对象时就对调用该方法，加入适当操作即可防止反序列化
    private Object readResolve()
    {
        return entity;
    }
}
