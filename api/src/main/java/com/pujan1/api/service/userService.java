package com.pujan1.api.service;

import com.pujan1.api.entity.user;

import java.util.List;

public interface userService {

    public List<user> findAll();

    public user findOne(String id);

    public user update(String id, user user);

    public user create(user user);

    public void delete(String id);
}
