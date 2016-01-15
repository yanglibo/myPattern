package com.myPattern.builder;

import org.junit.Test;

/**
 * Created by Administrator on 2016/1/15.
 */
public class BuilderTest {
    @Test
    public void testBuilder() {
        PersonDirector pd = new PersonDirector();
        Person person = pd.constructPerson(new ManBuilder());
        System.out.println(person.getBody());
        System.out.println(person.getFoot());
        System.out.println(person.getHead());
    }
}
