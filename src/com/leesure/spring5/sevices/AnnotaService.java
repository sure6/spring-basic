package com.leesure.spring5.sevices;

import com.leesure.spring5.dao.AnnotaDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

//@Service
@Component
public class AnnotaService {

    @Autowired //根据属性类型进行自动装配
    private AnnotaDao annotaDao;

//    @Autowired //根据属性类型进行自动装配
//    @Qualifier(value = "annotaDao") //根据名称进行注入，这个@Qualifier 注解的使用，和上面@Autowired 一起使用
//    private AnnotaDao annotaDao;

//    @Resource //可以根据类型注入，也可以根据名称注入（它属于javax包下的注解，不推荐使用！）
//    private AnnotaDao annotaDao;

    @Value(value = "aaaa") //注入普通类型属性
    private String name;

    public  void armInfo(){
        System.out.println("arm service execute "+ name);
        annotaDao.annotaInfo();
    }
}

