package com.example.jpamanytomany.Repository;

import com.example.jpamanytomany.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role,Long> {
    Role findByRoleName(String roleName) ;
}
