package com.leesure.spring5.sevices;

import com.leesure.spring5.dao.SureDao;

public class SureService {

    private SureDao sureDao;

    public void setSureDao(SureDao sureDao) {
        this.sureDao = sureDao;
    }

    public void testInfo(){
        System.out.println("im service");
        sureDao.sure();
    }
}
