package com.zzp.pattern;

import java.lang.reflect.Constructor;

public class SingleTest {
    public static void main(String[] args) {
        //反射入侵，强制初始化
        Constructor c = null;
        try {
            c = SingleDemo.class.getDeclaredConstructor(null);
            c.setAccessible(true);
            Object o1 = c.newInstance();
            Object o2 = c.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
