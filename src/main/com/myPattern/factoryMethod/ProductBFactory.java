package com.myPattern.factoryMethod;

/**
 * Created by Administrator on 2016/1/14.
 */
public class ProductBFactory implements FactoryMethodInterface{
    @Override
    public ProductB createProduct() {
        return new ProductB();
    }
}
