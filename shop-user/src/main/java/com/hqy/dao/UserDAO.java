package com.hqy.dao;

import com.hqy.domian.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDAO extends JpaRepository<User, Integer> {

}
