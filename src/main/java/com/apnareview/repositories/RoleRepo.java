package com.apnareview.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apnareview.entities.Role;

public interface RoleRepo  extends JpaRepository<Role, Integer>{

}
