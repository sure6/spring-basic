package com.leesure.spring5;

public class Employee {

    private String name;
    private String gendar;
    private Department department;

    public void setName(String name) {
        this.name = name;
    }

    public void setGendar(String gendar) {
        this.gendar = gendar;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public void empInfo(){
        System.out.println(name+": "+gendar+": "+department);
        department.deptInfo();
    }
}
