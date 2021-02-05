package cn.edw.mavendemo.dao;

import org.springframework.stereotype.Component;

/**
 * @author Edwin Xu
 * @date 2/5/2021 4:23 PM.
 */
@Component
public class UserDao {
    public String getUsername(){
        return "Edwin Xu";
    }
}
