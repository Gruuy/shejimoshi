package com.gruuy.shejimoshi.create.yuanxing;

/**
 * @author: Gruuy
 * @remark:
 * @date: Create in 11:52 2019/10/12
 */
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        YuanXing y=new YuanXing();
        y.setName("123");
        y.setPassword("123456");
        YuanXing y1=(YuanXing)y.clone();
        y1.setName("1234");
        System.out.println(y.getName());
        System.out.println(y1.getName());
    }
}

class YuanXing implements Cloneable{
    private String name;
    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone( );
    }
}
