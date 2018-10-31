package com.eakonovalov.restfulwebservices.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * Created by ekonovalov on 2018-10-11.
 */
@Service
public class UserDaoServiceImpl implements UserDaoService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PostRepository postRepository;

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
        if(!user.isPresent()) {
            throw new UserNotFoundException("id = " + id);
        }

        return user.get();
    }

    public void deleteById(Integer id) {
        userRepository.deleteById(id);
    }

    @Override
    public List<Post> getPosts(Integer id) {
        Optional<User> user = userRepository.findById(id);
        if(user.isPresent()) {
            return user.get().getPosts();
        }
        else {
            throw new UserNotFoundException("id = " + id);
        }
    }

    public Post createPost(Integer id, Post post) {
        User user = findById(id);
        post.setUser(user);
        postRepository.save(post);

        return post;
    }

}
