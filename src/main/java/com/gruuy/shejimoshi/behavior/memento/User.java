package com.gruuy.shejimoshi.behavior.memento;

/**
 * @author: Gruuy
 * @remark: 用户
 * @date: Create in 9:34 2019/10/17
 */
public class User {
    private String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Memerto createMemento(){
        return new Memerto(status);
    }

    public void resertMemento(Memerto memerto){
        this.status=memerto.getStatus();
    }
}
