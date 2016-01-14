package com.myPattern.factory;

/**
 * Created by Administrator on 2016/1/14.
 */
public class AbstractFactorySouth implements AbstractFactory {
    @Override
    public SouthFruit createFruit() {
        return new SouthFruit();
    }

    @Override
    public SouthVeggie createVeggie() {
        return new SouthVeggie();
    }
}
