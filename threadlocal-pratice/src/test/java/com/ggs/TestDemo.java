package com.ggs;

import org.junit.jupiter.api.Test;

import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;

/**
 * @Author lianghaohui
 * @Date 2022/5/18 14:00
 * @Description
 */
public class TestDemo {

    @Test
    public void test1() {
        SoftReference<byte[]> softReference = new SoftReference<>(new byte[1024 * 1024 * 10]);
        System.out.println(softReference.get());
        System.gc();
        System.out.println(softReference.get());
        byte[] bytes = new byte[(1024 * 1024 * 2)];
        System.gc();
        System.out.println(softReference.get());
    }

    @Test
    public void test2() {
        Object o = new Object();
        WeakReference<Object> weakReference = new WeakReference(o);
        System.out.println(weakReference.get());
        System.gc();
        System.out.println(weakReference.get());
        o = null;
        System.gc();
        System.out.println(weakReference.get());
    }

    public static void main(String[] args) {

    }

}
