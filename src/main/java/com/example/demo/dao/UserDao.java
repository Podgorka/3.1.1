package com.example.demo.dao;

import com.example.demo.model.User;

import java.util.List;

public interface UserDao {

    List<User> listAll();
    void delete(int id);
    void save(User user);

    void update(int id, User updatedUser);


    User show(int id);
}

