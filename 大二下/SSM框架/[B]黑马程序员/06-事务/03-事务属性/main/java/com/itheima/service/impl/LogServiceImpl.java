package com.itheima.service.impl;

import com.itheima.dao.LogDao;
import com.itheima.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LogServiceImpl implements LogService {
    @Autowired
    private LogDao logDao;

    public void log(String out, String in, Double money) {
        logDao.log(out + "--->" + in + " 转账" + money + "元");
    }
}
