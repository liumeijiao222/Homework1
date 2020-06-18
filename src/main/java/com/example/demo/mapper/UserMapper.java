package com.example.demo.mapper;

import com.example.demo.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserMapper {
    //注册成功，插入一条数据
    @Insert("insert into user1(username,password) values (#{username},#{password})")
    void add(User user);
    //检验注册的username是否已经存在数据库中，通过User类创建findByUsername对象，传进username进行与数据库比较
    @Select("select * from user1 where username = #{username}")
    User findByUsername(@Param("username") String username);
    //登录用：检验账号密码是否正确
    @Select("select * from user1 where username = #{username} and password = #{password}")
    User findByUsername_login(@Param("username") String username,
                              @Param("password") String password);
}
