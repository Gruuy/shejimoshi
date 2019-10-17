package com.gruuy.shejimoshi.behavior.status;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: Gruuy
 * @remark: 环境类  使用享元管理Status的子类
 * @date: Create in 15:38 2019/10/15
 */
public class Context {
    private Status status;
    private Map<String,Status> listMap=new HashMap<>();
    Context(){
        status=new Status1();
    }
    /** 设置状态的方法 */
    public void setStatus(Status status){
        this.status=status;
    }
    /** 没有的状态通过传递的class反射创建 */
    public Status getStatus(Class<?> clazz) throws Exception {
        if(!Status.class.isAssignableFrom(clazz)){
            throw new Exception("传递的class不是Status的子类");
        }
        Status status = listMap.get(clazz.getCanonicalName( ));
        if(status ==null){
            status= (Status) clazz.newInstance();
            listMap.put(clazz.getCanonicalName(),status);
            return status;
        }else {
            return status;
        }
    }
    /** 处理方法 */
    public void handle() throws Exception {
        status.handler(this);
    }
}
