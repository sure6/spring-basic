package com.leesure.spring5;

/**
 * 构造器注入
 */
public class Orders {
    private String oname;
    private String oaddress;

    public Orders() {
    }

    public void setOname(String oname) {
        this.oname = oname;
    }

    public Orders(String oname, String oaddress) {
        this.oname = oname;
        this.oaddress = oaddress;
    }

    public void orderInfo(){
        System.out.println(oname+": "+oaddress);
    }
}
