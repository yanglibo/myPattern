package com.myPattern.factoryMethod;

/**
 * Created by Administrator on 2016/1/14.
 */
public abstract class AbstractProduct {
    public String printClassName(){
        return this.getClass().getSimpleName();
    }
}
