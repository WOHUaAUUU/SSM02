package com.ssy.util;

import lombok.Data;

@Data
public class R {
    private int code = 200;
    private boolean flag = true;
    private Object date;
    private String msg;

    // 定义一个静态方法ok，接收一个Object类型的参数date，返回一个R类型的对象
    public static R ok(Object date) {
        // 创建一个R类型的对象r
        R r = new R();
        // 将参数date赋值给对象r的date属性
        r.date = date;
        // 返回对象r
        return r;
    }

// 定义一个静态方法error，接收一个Object类型的参数date，返回一个R类型的对象
    public static R error(Object date,String msg) {
        // 创建一个R类型的对象r
        R r = new R();
        // 将参数date赋值给对象r的date属性
        r.date = date;
        // 将对象r的flag属性设置为false
        r.flag = false;
        // 将对象r的code属性设置为500
        r.code = 500;
        r.msg = msg;
        // 返回对象r
        return r;
    }
}
