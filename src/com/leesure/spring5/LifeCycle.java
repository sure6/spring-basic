package com.leesure.spring5;

public class LifeCycle {
    private String name;

    public LifeCycle() {
        System.out.println("first execute 通过构造器创建 bean 实例（无参数构造）");
    }

    public void setUser(String name) {
        this.name = name;
        System.out.println("second execute bean 的属性设置值和对其他 bean 引用");
    }

    public void init(){
        System.out.println("third execute 调用 bean 的初始化的方法（需要进行配置初始化的方法）");
    }

    public void destroy(){
        System.out.println("fifth execute 当容器关闭时候，调用 bean 的销毁的方法（需要进行配置销毁的方法）");
    }


}

