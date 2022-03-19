package com.example.jpamanytomany.Repository;

import com.example.jpamanytomany.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserReposiory extends JpaRepository<User, Long> {
    User findByUsername(String username) ;


}
