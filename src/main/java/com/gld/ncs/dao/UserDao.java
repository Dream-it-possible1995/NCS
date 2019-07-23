package com.gld.ncs.dao;

import com.gld.ncs.model.User;
import java.util.List;

public interface UserDao {
    List<User> selectUsers();
    void deleteById(int id);
}
