package com.vijay.learn.Repository

import com.vijay.learn.common.model.User

interface UserRepository {

    void create(User user)

    List<User> getAll()

    void deleteUser(long id)

    User getUser(long id)

    void updateUser(long id, User user)

}