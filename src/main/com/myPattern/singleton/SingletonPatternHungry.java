package com.myPattern.singleton;

/**
 * Created by Administrator on 2016/1/13.
 */
public class SingletonPatternHungry {
    /**
     * **
     * 饿汉式
     */
    private static SingletonPatternHungry singletonPattern = new SingletonPatternHungry();

    //私有化默认构造器方法
    private SingletonPatternHungry() {
    }

    public static SingletonPatternHungry getSingletonPattern() {
        return singletonPattern;
    }


}
