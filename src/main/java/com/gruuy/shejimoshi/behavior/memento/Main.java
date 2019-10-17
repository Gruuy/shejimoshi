package com.gruuy.shejimoshi.behavior.memento;

/**
 * @author: Gruuy
 * @remark: User通过保存上一次状态到Memerto  实现备忘录功能
 * @date: Create in 9:38 2019/10/17
 */
public class Main {
    public static void main(String[] args){
        User user=new User();
        Admin admin=new Admin();
        user.setStatus("123");
        System.out.println("初始状态："+user.getStatus() );
        admin.setMemerto(user.createMemento());
        user.setStatus("1");
        System.out.println("修改后的状态："+user.getStatus() );
        user.resertMemento(admin.getMemerto());
        System.out.println("回滚后的状态:"+user.getStatus() );
    }
}
