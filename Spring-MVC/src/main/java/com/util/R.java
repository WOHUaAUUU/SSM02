package com.util;

import lombok.Data;

@Data
public class R {
    private int code = 200;
    private boolean flag = true;
    private Object date;

    public static R ok(Object date) {
        R r = new R();
        r.date = date;
        return r;
    }

    public static R error(Object date) {
        R r = new R();
        r.date = date;
        r.flag = false;
        r.code = 500;
        return r;
    }
}
