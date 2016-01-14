package com.myPattern.factory;

/**
 * Created by Administrator on 2016/1/14.
 */
public class AbstractFactoryNorth implements AbstractFactory {
    @Override
    public NorthFruit createFruit() {
        return new NorthFruit();
    }

    @Override
    public NorthVeggie createVeggie() {
        return new NorthVeggie();
    }
}
