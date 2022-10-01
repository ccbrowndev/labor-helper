package com.laborhelper.enterprise.service;

import org.apache.catalina.User;

public interface IUserService{
    User fetchUserByID(int i);
}
