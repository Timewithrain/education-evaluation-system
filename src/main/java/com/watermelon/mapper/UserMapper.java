package com.watermelon.mapper;

import com.watermelon.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserMapper {

    List<User> listUser();

    int getUserNumber();

    User getUserById(int id);

    User getUserByName(String name);

    int addUser(User user);

    int updateUser(User user);

    int deleteUser(int id);

}
