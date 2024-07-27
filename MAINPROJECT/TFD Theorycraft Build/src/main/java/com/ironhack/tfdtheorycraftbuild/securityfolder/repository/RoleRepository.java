package com.ironhack.tfdtheorycraftbuild.securityfolder.repository;

import com.ironhack.tfdtheorycraftbuild.securityfolder.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

    Role findByName(String name);
}
