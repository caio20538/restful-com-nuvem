package com.dio.restful_com_nuvem.service.impl;

import com.dio.restful_com_nuvem.domain.model.User;
import com.dio.restful_com_nuvem.domain.repository.UserRepository;
import com.dio.restful_com_nuvem.service.UserService;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User findById(Long id) {
        return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public User create(User createUser) {
        if (userRepository.existsByAccountNumber(createUser.getAccount().getNumber()))
            throw new IllegalArgumentException("This Account number already exists");

        return userRepository.save(createUser);
    }
}
