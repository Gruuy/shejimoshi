package com.gruuy.shejimoshi.behavior.memento;

/**
 * @author: Gruuy
 * @remark: 备忘录
 * @date: Create in 9:36 2019/10/17
 */
public class Memerto {
    private String status;

    public Memerto(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
