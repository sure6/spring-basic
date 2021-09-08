package com.leesure.spring5;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student {
    private String[] course;
    private List<Orders> list;
    private Set<String> set;
    private Map<String,String> map;

    public void setCourse(String[] course) {
        this.course = course;
    }

    public void setList(List<Orders> list) {
        this.list = list;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public void studentInfo(){
        for (String i:course) {
            System.out.println(i);
        }

        for (Orders ord:list) {
           ord.orderInfo();
        }
        for (String ord:set) {
            System.out.println(ord);
        }
        for (String k:map.keySet()) {
            System.out.println(k+"="+map.get(k));
        }
    }
}
