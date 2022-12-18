package com.itheima.dao.impl;

import com.itheima.dao.BookDao;

import java.util.*;

public class BookDaoImpl implements BookDao {
    private int[] array;
    private List<String> list;
    private Set<String> set;
    private Map<String, String> map;
    private Properties properties;

    public void setArray(int[] array) {
        this.array = array;
    }
    public void setList(List<String> list) {
        this.list = list;
    }
    public void setSet(Set<String> set) {
        this.set = set;
    }
    public void setMap(Map<String, String> map) {
        this.map = map;
    }
    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public void save() {
        System.out.println("book dao save...");
        System.out.println("array = " + Arrays.toString(array));
        System.out.println("list = " + list);
        System.out.println("set = " + set);
        System.out.println("map = " + map);
        System.out.println("properties = " + properties);
    }
}
