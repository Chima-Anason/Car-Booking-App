package com.anagraceTech.user;

import java.util.UUID;

public class UserService {

    private final UserDao userDao;

    public UserService(UserDao userDao) {
        this.userDao = userDao;
    }

    public User[] getUsers() {
        return userDao.getUsers();
    }


    public User getUserById(UUID id){
        for (User user : userDao.getUsers()) {
            if(id == user.getId()){
                return user;
            }
        }
        return null;
    }

}
