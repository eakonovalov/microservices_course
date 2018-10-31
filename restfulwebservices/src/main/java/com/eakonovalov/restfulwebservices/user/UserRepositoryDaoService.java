package com.eakonovalov.restfulwebservices.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * Created by ekonovalov on 2018-10-11.
 */
@Service("repository")
public class UserRepositoryDaoService implements UserDaoService {

    @Autowired
    private UserRepository userRepository;

    public List<User> findAll() {
        List<User> users = new ArrayList<>();
        userRepository.findAll().forEach(users::add);

        return users;
    }

    public User create(User user) {
        return userRepository.save(user);
    }

    public User findById(Integer id) {
        Optional<User> user = userRepository.findById(id);
        if(user.isPresent()) {
            return user.get();
        }

        return null;
    }

    public void deleteById(Integer id) {
        userRepository.deleteById(id);
    }

}
