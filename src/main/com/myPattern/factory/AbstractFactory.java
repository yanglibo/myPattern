package com.myPattern.factory;

/**
 * Created by Administrator on 2016/1/14.
 */
public interface AbstractFactory {
    AbstractFruit createFruit();
    AbstractVeggie createVeggie();
}
