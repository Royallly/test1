package com.softusing.BaiYunXiao.mapperIterfac;

import com.softusing.BaiYunXiao.entity.User;

public interface UserServiceInterface {
//    int save(User user);
    int save(User user);

    boolean login(User user);
}
