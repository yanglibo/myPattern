package com.myPattern;

/**
 * Created by Administrator on 2016/1/13.
 */
public class SingletonPatternDblClock {
    /**
     * **
     * 双重锁模式
     */
    private static SingletonPatternDblClock singletonPattern = null;

    //私有化默认构造器方法
    private SingletonPatternDblClock() {
    }

    public static SingletonPatternDblClock getSingletonPattern() {
        if (singletonPattern == null) {
            synchronized (SingletonPatternDblClock.class) {
                if (singletonPattern == null) {
                    singletonPattern = new SingletonPatternDblClock();
                }
            }
        }
        return singletonPattern;
    }

}
