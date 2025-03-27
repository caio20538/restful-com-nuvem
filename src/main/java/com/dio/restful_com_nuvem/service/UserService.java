package com.dio.restful_com_nuvem.service;

import com.dio.restful_com_nuvem.domain.model.User;

public interface UserService {
    User findById(Long id);

    User create(User createUser);
}
