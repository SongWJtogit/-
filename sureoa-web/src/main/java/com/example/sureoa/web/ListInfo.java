package com.example.sureoa.web;

import com.sun.org.apache.xpath.internal.operations.String;

import java.util.Collections;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.List;

public class ListInfo {
    List list = Collections.synchronizedList(new LinkedList<>());

    public List getList() {
        return list;
    }

    public void setList(List list) {
        this.list = list;
    }

    public static void main(String[] args) {
/*        List list = Collections.synchronizedList(new LinkedList<>());
        list.add(0,"我是第一个1");
        list.add(1,"我是第一个2");
        list.add(2,"我是第二个1");
        list.add(2,"我才是第二个2");
        for (Object s:list){
            System.out.println(s);
        }*/

    }
}
