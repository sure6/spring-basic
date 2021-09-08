package com.leesure.spring5.dao;

import org.springframework.stereotype.Repository;

@Repository(value = "annotaDao")
public class AnnotaDaoImpl implements AnnotaDao{
    @Override
    public void annotaInfo() {
        System.out.println("annotaDaoimpl execute");
    }
}
