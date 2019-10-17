package com.gruuy.shejimoshi.structure.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: Gruuy
 * @remark: 树枝节点
 * @date: Create in 16:18 2019/10/14
 */
public class Branch implements Component {
    public List<Component> list=new ArrayList<>();

    @Override
    public void show() {
        list.stream().forEach(a->a.show());
    }

    @Override
    public double sum() {
        return list.stream().mapToDouble(Component::sum).sum();
    }
}
