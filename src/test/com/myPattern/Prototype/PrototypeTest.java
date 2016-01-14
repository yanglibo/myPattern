package com.myPattern.Prototype;

import com.myPattern.prototype.PrototypeDeepFalse;
import com.myPattern.prototype.PrototypeDeepTrue;
import com.myPattern.prototype.PrototypeShallow;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/1/14.
 */
public class PrototypeTest implements Cloneable {
    @Test
    public void testPrototypeShallow() {
        System.out.println("-------------this shallow Prototype------------");
        List<String> oldList = new ArrayList<String>(1);
        oldList.add("1");
        PrototypeShallow oldObject = new PrototypeShallow("old", "old", oldList);
        PrototypeShallow newObject = oldObject.clone();
        newObject.setName("new");
        newObject.setPassword("new");
        newObject.getList().add("2");
        System.out.println("oldObject's listSize is" + oldObject.getList().size());
        System.out.println("oldObject's name is " + oldObject.getName());
        System.out.println("oldObject's password is " + newObject.getPassword());
    }

    @Test
    public void testPrototypeDeepFalse() {
        System.out.println("-------------this deep Prototype------------");
        List<String> oldList = new ArrayList<String>(1);
        oldList.add("1");
        PrototypeDeepFalse oldObject = new PrototypeDeepFalse("old", "old", oldList);
        List<PrototypeDeepFalse> prototypeDeeps = new ArrayList<PrototypeDeepFalse>(1);
        prototypeDeeps.add(new PrototypeDeepFalse("1","1",null));
        oldObject.setPrototypeDeepList(prototypeDeeps);
        PrototypeDeepFalse newObject = oldObject.clone();
        newObject.setName("new");
        newObject.setPassword("new");
        newObject.getList().add("2");
        newObject.getPrototypeDeepList().get(0).setName("123");
        newObject.getPrototypeDeepList().add(new PrototypeDeepFalse("2", "2", null));
        System.out.println(oldObject.getPrototypeDeepList().get(0).getName());
        System.out.println(oldObject.getPrototypeDeepList().size());
        System.out.println("oldObject's listSize is" + oldObject.getList().size());
        System.out.println("oldObject's name is " + oldObject.getName());
        System.out.println("oldObject's name is " + oldObject.getName());
    }

    @Test
    public void testPrototypeDeepTrue() throws Exception{
        System.out.println("-------------this deep Prototype------------");
        List<String> oldList = new ArrayList<String>(1);
        oldList.add("1");
        PrototypeDeepTrue oldObject = new PrototypeDeepTrue("old", "old", oldList);
        List<PrototypeDeepTrue> prototypeDeeps = new ArrayList<PrototypeDeepTrue>(1);
        prototypeDeeps.add(new PrototypeDeepTrue("1","1",null));
        oldObject.setPrototypeDeepList(prototypeDeeps);
        PrototypeDeepTrue newObject = (PrototypeDeepTrue)oldObject.deepClone();
        newObject.setName("new");
        newObject.setPassword("new");
        newObject.getList().add("2");
        newObject.getPrototypeDeepList().get(0).setName("123");
        newObject.getPrototypeDeepList().add(new PrototypeDeepTrue("2", "2", null));
        System.out.println(oldObject.getPrototypeDeepList().get(0).getName());
        System.out.println(oldObject.getPrototypeDeepList().size());
        System.out.println("oldObject's listSize is" + oldObject.getList().size());
        System.out.println("oldObject's name is " + oldObject.getName());
        System.out.println("oldObject's name is " + oldObject.getName());
    }
}
