package com.dailycoding.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dailycoding.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
