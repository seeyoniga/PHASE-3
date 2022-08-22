package com.example.user;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service

public class UserService {
    @Autowired 
    private UserRepository repo;
    
    public List<User> listAll() {
        return (List<User>) repo.findAll();
    }
    public void save(User customer) {
    	repo.save(customer);
    }
    public User get(long id) {
    	Optional<User> result=repo.findById(id);
    	return result.get();
    }
    
    public List<User> search(String keyword) {
        return repo.search(keyword);
    }
}