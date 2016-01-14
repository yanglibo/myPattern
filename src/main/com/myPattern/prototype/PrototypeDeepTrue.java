package com.myPattern.prototype;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/1/14.
 */
public class PrototypeDeepTrue implements Serializable {
    private String name;
    private String password;
    private List<String> list;
    private List<PrototypeDeepTrue> prototypeDeepList;

    /* public PrototypeShallow() {
     }
 */
    public PrototypeDeepTrue(String name, String password, List<String> list) {
        this.name = name;
        this.password = password;
        this.list = list;
    }

    public Object deepClone() throws IOException,
            OptionalDataException, ClassNotFoundException {//将对象写到流里
        ByteArrayOutputStream bo = new ByteArrayOutputStream();
        ObjectOutputStream oo = new ObjectOutputStream(bo);
        oo.writeObject(this);//从流里读出来
        ByteArrayInputStream bi = new ByteArrayInputStream(bo.toByteArray());
        ObjectInputStream oi = new ObjectInputStream(bi);
        return (oi.readObject());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public List<PrototypeDeepTrue> getPrototypeDeepList() {
        return prototypeDeepList;
    }

    public void setPrototypeDeepList(List<PrototypeDeepTrue> prototypeDeepList) {
        this.prototypeDeepList = prototypeDeepList;
    }
}
