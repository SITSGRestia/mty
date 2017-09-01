package com.tripadv.mty.repository.login;

import com.tripadv.mty.domain.login.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoginRepository extends JpaRepository<Admin,Integer>{
    Admin findByAdminNameAndPassword(String adminName, String password);
}
