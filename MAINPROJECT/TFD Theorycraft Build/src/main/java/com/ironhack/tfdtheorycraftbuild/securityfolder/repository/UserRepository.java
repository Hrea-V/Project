package com.ironhack.tfdtheorycraftbuild.securityfolder.repository;

import com.ironhack.tfdtheorycraftbuild.securityfolder.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsername(String username);
}
