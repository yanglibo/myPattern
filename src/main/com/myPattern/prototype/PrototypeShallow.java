package com.myPattern.prototype;

import java.util.List;

/**
 * Created by Administrator on 2016/1/14.
 */
public class PrototypeShallow implements Cloneable {
    private String name;
    private String password;
    private List<String> list;

   /* public PrototypeShallow() {
    }
*/
    public PrototypeShallow(String name, String password, List<String> list) {
        this.name = name;
        this.password = password;
        this.list = list;
    }

    public PrototypeShallow clone() {
        PrototypeShallow result = null;
        try {
            result = (PrototypeShallow) super.clone();
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

}
