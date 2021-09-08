package com.leesure.spring5;

import org.springframework.beans.factory.FactoryBean;

public class MyBean implements FactoryBean<User> {
    @Override
    public User getObject() throws Exception {
        User user = new User();
        return user;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    @Override
    public boolean isSingleton() {
        return FactoryBean.super.isSingleton();
    }
}
