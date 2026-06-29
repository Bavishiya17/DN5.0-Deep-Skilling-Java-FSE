package com.cognizant.mockito;

public class UserService {
    private UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public String getUserById(int id) {
        return repository.findById(id);
    }
}
