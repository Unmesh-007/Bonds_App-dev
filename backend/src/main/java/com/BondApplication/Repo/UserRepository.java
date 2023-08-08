package com.BondApplication.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.BondApplication.Models.User;

public interface UserRepository extends JpaRepository<User , Long>{

}
