package com.deploy.pertemuan12.repository;

import com.deploy.pertemuan12.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class UserRepository extends JpaRepository<User, String> {
    Optional<User> findByUsername(String username);
}
