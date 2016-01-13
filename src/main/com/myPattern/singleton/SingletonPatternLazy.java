package com.myPattern.singleton;

/**
 * Created by Administrator on 2016/1/13.
 */
public class SingletonPatternLazy {
    /**
     * **
     * 懒汉式
     */
    private static SingletonPatternLazy singletonPattern = null;

    //私有化默认构造器方法
    private SingletonPatternLazy() {
    }

    public static SingletonPatternLazy getSingletonPattern() {
        if (singletonPattern == null) {
            singletonPattern = new SingletonPatternLazy();
        }
        return singletonPattern;
    }


}
