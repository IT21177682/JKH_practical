package com.example.POS.UserRepository;

import com.example.POS.UserEntity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;


public interface UserRepository extends JpaRepository<User, Long> {
    @Procedure(name = "sp_RegisterUser")
    Long registerUser(@Param("username") String username, @Param("password") String password);

    @Procedure(name = "sp_LoginUser")
    Integer loginUser(@Param("username") String username, @Param("password") String password);
}
