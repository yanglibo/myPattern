package com.myPattern.factory;

/**
 * Created by Administrator on 2016/1/14.
 */
public abstract class AbstractFruit {
    public String getClassName(){
        return this.getClass().getSimpleName();
    }
}
