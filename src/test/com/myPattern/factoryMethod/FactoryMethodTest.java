package com.myPattern.factoryMethod;

import org.junit.Test;

/**
 * Created by Administrator on 2016/1/14.
 */
public class FactoryMethodTest {
    @Test
    public void testFactoryMethod(){
        FactoryMethodInterface factoryA = new ProductAFactory();
        FactoryMethodInterface factoryB = new ProductBFactory();
        System.out.println("我产生了：类"+factoryA.createProduct().printClassName()+"的实例");
        System.out.println("我产生了：类"+factoryB.createProduct().printClassName()+"的实例");
    }
}
