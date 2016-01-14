package com.myPattern.factoryMethod;

/**
 * Created by Administrator on 2016/1/14.
 */
public class ProductAFactory implements FactoryMethodInterface{
    @Override
    public ProductA createProduct() {
        return new ProductA();
    }
}
