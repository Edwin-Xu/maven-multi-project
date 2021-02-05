package cn.edw.mavendemo.service.impl;

import cn.edw.mavendemo.dao.UserDao;
import cn.edw.mavendemo.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * @author Edwin Xu
 * @date 2/5/2021 4:22 PM.
 */
@Service
public class HelloServiceImpl  implements HelloService {
    @Autowired
    private UserDao userDao;

    @Override
    public String sayHello() {
        return "Hello, "+userDao.getUsername();
    }
}
