package myPattern;

import org.junit.Test;

/**
 * Created by Administrator on 2016/1/13.
 */
public class SingletonPatternTest {

    @Test//测试懒汉单例模式
    public void testLazy() {
        SingletonPatternLazy singletonPattern1 = SingletonPatternLazy.getSingletonPattern();
        SingletonPatternLazy singletonPattern2 = SingletonPatternLazy.getSingletonPattern();
        SingletonPatternLazy singletonPattern3 = SingletonPatternLazy.getSingletonPattern();
        System.out.println("lazy1-2:" + String.valueOf(singletonPattern1 == singletonPattern2));
        System.out.println("lazy1-3" + String.valueOf(singletonPattern1 == singletonPattern3));
        System.out.println("lazy2-3" + String.valueOf(singletonPattern2 == singletonPattern3));
    }

    @Test//测试双重锁单例模式
    public void testDblClock() {
        SingletonPatternDblClock singletonPattern1 = SingletonPatternDblClock.getSingletonPattern();
        SingletonPatternDblClock singletonPattern2 = SingletonPatternDblClock.getSingletonPattern();
        SingletonPatternDblClock singletonPattern3 = SingletonPatternDblClock.getSingletonPattern();
        System.out.println("DblClock-2:" + String.valueOf(singletonPattern1 == singletonPattern2));
        System.out.println("DblClock-3" + String.valueOf(singletonPattern1 == singletonPattern3));
        System.out.println("DblClock-3" + String.valueOf(singletonPattern2 == singletonPattern3));
    }

    @Test//测试饿汉单例模式
    public void testHungry() {
        SingletonPatternHungry singletonPattern1 = SingletonPatternHungry.getSingletonPattern();
        SingletonPatternHungry singletonPattern2 = SingletonPatternHungry.getSingletonPattern();
        SingletonPatternHungry singletonPattern3 = SingletonPatternHungry.getSingletonPattern();
        System.out.println("Hungry-2:" + String.valueOf(singletonPattern1 == singletonPattern2));
        System.out.println("Hungry-3" + String.valueOf(singletonPattern1 == singletonPattern3));
        System.out.println("Hungry-3" + String.valueOf(singletonPattern2 == singletonPattern3));
    }
}
