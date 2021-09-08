package com.leesure.spring5.testdemo;

import com.leesure.spring5.*;
import com.leesure.spring5.sevices.AnnotaService;
import com.leesure.spring5.sevices.SureService;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserTest {

    @Test
    public void test1(){
//        1.加载配置文件
        //加载配置文件时候就会把在配置文件对象进行创建(推荐使用)
        ApplicationContext context=new ClassPathXmlApplicationContext("leesure.xml");
//        2. 获取对象
//        User user = context.getBean("user", User.class);
//        user.sayHi();
        Book book = context.getBean("book", Book.class);
        book.bookInfo();
//          Orders orders = context.getBean("orders", Orders.class);
//          orders.orderInfo();
    }

    @Test
    public void test2(){
        //加载配置文件时候不会创建对象，在获取对象时才会创建对象。
        BeanFactory context=new ClassPathXmlApplicationContext("leesure.xml");
        Book book = context.getBean("book", Book.class);
        book.bookInfo();
    }

    /**
     * 空值和特殊值注入
     */
    @Test
    public void test3(){
        ApplicationContext context=new ClassPathXmlApplicationContext("leesure.xml");
        Book book = context.getBean("book", Book.class);
        book.bookInfo();
    }

    /**
     *  引用注入,外部bean注入
     */
    @Test
    public void test4(){
        ApplicationContext context=new ClassPathXmlApplicationContext("leesure2.xml");
        SureService sureService = context.getBean("sureService", SureService.class);
        sureService.testInfo();
    }

    /**
     *  注入属性-内部bean
     */
    @Test
    public void test5(){
        ApplicationContext context=new ClassPathXmlApplicationContext("leesure2.xml");
//        Employee employee = context.getBean("employee", Employee.class);
        Employee employee1 = context.getBean("employee1", Employee.class);
        employee1.empInfo();
    }

    /**
     *  集合注入
     */
    @Test
    public void test6(){
        ApplicationContext context=new ClassPathXmlApplicationContext("leesure2.xml");
        Student student = context.getBean("student", Student.class);
        student.studentInfo();

    }

    /**
     * IOC 操作 Bean 管理（FactoryBean）
     * 1、Spring 有两种类型 bean，一种普通 bean，另外一种工厂 bean（FactoryBean）
     * 2、普通 bean：在配置文件中定义 bean 类型就是返回类型
     *  3、工厂 bean：在配置文件定义 bean 类型可以和返回类型不一样 第一步 创建类，让这个类作为工厂 bean，实现接口 FactoryBean 第二步 实现接口里面的方法，在实现的方法中定义返回的 bean 类型
     */
    @Test
    public void test7(){
        ApplicationContext context=new ClassPathXmlApplicationContext("leesure3.xml");
        User user = context.getBean("myBean", User.class);//返回值类型可以不是定义的bean类型！
        user.sayHi();
    }

    /**
     * IOC 操作 Bean 管理（bean 作用域）
     */
    @Test
    public void test8(){
        ApplicationContext context=new ClassPathXmlApplicationContext("leesure3.xml");
        User user1 = context.getBean("user", User.class);
        User user2 = context.getBean("user", User.class);
        System.out.println(user1);
        System.out.println(user2);
    }

    /**
     *  IOC 操作 Bean 管理（bean 生命周期）
     */
    @Test
    public void test9(){
        ApplicationContext context=new ClassPathXmlApplicationContext("leesure3.xml");
        LifeCycle lifeCycle = context.getBean("lifeCycle", LifeCycle.class);
        System.out.println("fourth execute bean 可以使用了（对象获取到了）"+lifeCycle);
        //手动让 bean 实例销毁
        ((ClassPathXmlApplicationContext)context).close();
    }

    /**
     *  基于注解的注入和注解属性注入
     */
    @Test
    public void test10(){
        ApplicationContext context=new ClassPathXmlApplicationContext("leesure-annotation.xml");
        AnnotaService armService = context.getBean("annotaService", AnnotaService.class);
        armService.armInfo();
    }

    /**
     *  基于完全注解开发
     */
    @Test
    public void test11(){
        ApplicationContext context=new AnnotationConfigApplicationContext(ConfigClass.class);
        AnnotaService armService = context.getBean("annotaService", AnnotaService.class);
        armService.armInfo();
    }
}
