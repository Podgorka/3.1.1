package com.example.demo.service;

import com.example.demo.dao.UserDao;
import com.example.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component
@Transactional(readOnly = false)
public class UserServiceImp implements UserService {

    private final UserDao userDao;
    @Autowired
    public UserServiceImp(UserDao userDao) {
        this.userDao = userDao;
    }

    public List<User> listAll() {
        return userDao.listAll();
    }
    public void delete(int id) {
        userDao.delete(id);
    }
    public void save(User user) {
        userDao.save(user);
    }
    public void update(int id, User updatedUser) { userDao.update(id, updatedUser);}
    public User show(int id) {
       return userDao.show(id);
    }

}
