package ru.vovk.spring315.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import ru.vovk.spring315.model.UserEntity;

@Service
public interface UserService {
    void getAllUsers();

    ResponseEntity<String> addUser(UserEntity user);

    ResponseEntity<String> updateUser(UserEntity user);

    ResponseEntity<String> deleteUser(Long id);
}
