package com.softusing.BaiYunXiao.service;

import com.softusing.BaiYunXiao.entity.User;
import com.softusing.BaiYunXiao.mapperIterfac.UserMapper;
import com.softusing.BaiYunXiao.mapperIterfac.UserServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//@Service
@Service
public class UserService implements UserServiceInterface {
//    @Autowired
//    private UserMapper userMapper;
//    public int save(User user){
//        return userMapper.insert(user);
//    }

    @Autowired
    private UserMapper userMapper;

    public int save(User user) {
        return userMapper.insert(user);
    }

    public boolean login(User user) {
        String name = user.getUserName();
        String password = user.getPassword();
        User user1 = userMapper.findByUserName(name);
        if (user1 == null) {
            return false;
        } else {
            if (password.equals(user1.getPassword())) {
                return true;
            } else {
                return false;
            }
        }
    }
}
