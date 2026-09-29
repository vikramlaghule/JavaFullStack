package com.vikram.RegisterLogin.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vikram.RegisterLogin.Entity.Users;

@Repository
public interface UserRepo extends JpaRepository<Users, Integer> {

}
