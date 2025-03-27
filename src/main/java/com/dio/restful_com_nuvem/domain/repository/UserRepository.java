package com.dio.restful_com_nuvem.domain.repository;

import com.dio.restful_com_nuvem.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    boolean existsByAccountNumber(String accountNumber);
}
