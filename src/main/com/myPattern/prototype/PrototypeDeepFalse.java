package com.myPattern.prototype;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/1/14.
 */
public class PrototypeDeepFalse implements Cloneable {
    private String name;
    private String password;
    private List<String> list;
    private List<PrototypeDeepFalse> prototypeDeepList;

    /* public PrototypeShallow() {
     }
 */
    public PrototypeDeepFalse(String name, String password, List<String> list) {
        this.name = name;
        this.password = password;
        this.list = list;
    }

    public PrototypeDeepFalse clone() {
        PrototypeDeepFalse result = null;
        try {
            result = (PrototypeDeepFalse) super.clone();
            if (list != null) {
                result.setList(new ArrayList<String>(list));
                result.setPrototypeDeepList(new ArrayList<PrototypeDeepFalse>(prototypeDeepList));
            }
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return result;
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

    public List<PrototypeDeepFalse> getPrototypeDeepList() {
        return prototypeDeepList;
    }

    public void setPrototypeDeepList(List<PrototypeDeepFalse> prototypeDeepList) {
        this.prototypeDeepList = prototypeDeepList;
    }
}
