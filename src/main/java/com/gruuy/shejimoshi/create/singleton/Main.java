package com.gruuy.shejimoshi.create.singleton;


import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author: Gruuy
 * @remark:
 * @date: Create in 11:49 2019/10/10
 */
@SuppressWarnings("all")
public class Main {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException, IOException, ClassNotFoundException, CloneNotSupportedException {
        ErHan erHan=ErHan.getEntity();
        ErHan erHan2=ErHan.getEntity();
        if(erHan==erHan2){
            System.out.println("ErHan singleton Right" );
        }else {
            System.out.println("ErHan singleton Boom" );
        }
        ErHan erHan3= (ErHan) erHan.clone();
        System.out.println(erHan3 );
        System.out.println(erHan );
        LanHan lanhan= null;
        LanHan lanhan2=null;
        try {
            lanhan = LanHan.getEntity();
            lanhan2=LanHan.getEntity();
            if(lanhan==lanhan2){
                System.out.println("LanHan singleton Right" );
            }else {
                System.out.println("LanHan singleton Boom" );
            }

            //反射破坏单例
            Class clazz=ErHan.class;
            //获取构造方法
            Constructor cons=clazz.getDeclaredConstructor();
            //强制使用private  取消 Java 语言访问检查
            cons.setAccessible(true);
            //利用构造方法创建对象
            ErHan boomSingle= (ErHan) cons.newInstance();
            System.out.println("no boom:"+erHan );
            System.out.println("no boom:"+erHan2 );
            System.out.println("boom:"+boomSingle );

            //序列化破坏单例
            ObjectOutputStream outputStream=new ObjectOutputStream(new FileOutputStream("object"));
            outputStream.writeObject(erHan);
            File file=new File("object");
            ObjectInputStream inputStream=new ObjectInputStream(new FileInputStream(file));
            ErHan boomSingle2= (ErHan) inputStream.readObject();
            System.out.println("boom:"+boomSingle2 );
            file.delete();
            outputStream.close();
            inputStream.close();
        } catch (Exception e) {
            e.printStackTrace( );
        }

        //反转JSON破坏
//        String jsonObject=JSONObject.toJSONString(erHan);
//        JSONObject json=JSONObject.parseObject(jsonObject);
//        ErHan boomSingle3 = json.toJavaObject(ErHan.class);
//        System.out.println("boom:"+boomSingle3 );

        //懒汉防止破坏后:
        Class clazz=LanHan.class;
        //获取构造方法
        Constructor cons=clazz.getDeclaredConstructor();
        //强制使用private  取消 Java 语言访问检查
        cons.setAccessible(true);
        //利用构造方法创建对象
        ErHan boomLan= (ErHan) cons.newInstance();
        System.out.println("no boom:"+lanhan );
        System.out.println("no boom:"+lanhan2 );
        System.out.println("boom:"+boomLan );

        //防止序列化破坏：
        ObjectOutputStream outputStream=new ObjectOutputStream(new FileOutputStream("object"));
        outputStream.writeObject(lanhan);
        File file=new File("object");
        ObjectInputStream inputStream=new ObjectInputStream(new FileInputStream(file));
        ErHan boomLan2= (ErHan) inputStream.readObject();
        System.out.println("boom:"+boomLan2 );
        file.delete();
        outputStream.close();
        inputStream.close();
    }

}
