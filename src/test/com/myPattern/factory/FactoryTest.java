package com.myPattern.factory;

import org.junit.Test;

/**
 * Created by Administrator on 2016/1/14.
 */
public class FactoryTest {
    @Test
    public void testFactory(){
        AbstractFactory southFactory = new AbstractFactorySouth();
        AbstractFactory northFactory = new AbstractFactoryNorth();
        System.out.println(southFactory.createFruit().getClassName());
        System.out.println(southFactory.createVeggie().getClassName());
        System.out.println(northFactory.createFruit().getClassName());
        System.out.println(northFactory.createVeggie().getClassName());
    }
}
