package com.leesure.spring5;

/**
 * Setter注入
 */
public class Book {
    private String bname;
    private String bauthor;
    private String bsurface;
    private String publish;

    public void setPublish(String publish) {
        this.publish = publish;
    }

    public void setBsurface(String bsurface) {
        this.bsurface = bsurface;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public void setBauthor(String bauthor) {
        this.bauthor = bauthor;
    }

    public void bookInfo(){
        System.out.println(bname+": "+bauthor+": " +bsurface+":"+publish);
    }
}
