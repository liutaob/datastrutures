/*
 * Copyright 2019 Guangdong Etone Technology Co.,Ltd.
 * All rights reserved.
 */
package queue;

import java.util.LinkedList;

/**
 * 集合实现
 *
 * @author <a href="mailto:maxid@qq.com">LiuTao</a>
 * @since $$Id$$
 */
public class Queue2 {
    private LinkedList list = new LinkedList();

    /*
     * 模拟进栈方法
     */
    public void in(Object obj) {
        list.addLast(obj);
    }

    /*
     * 模拟出栈方法
     */
    public Object out() {
        return list.removeFirst();
    }

    /*
     * 模拟栈结构是否为空
     */
    public boolean isEmpty() {
        return list.isEmpty();
    }
}
