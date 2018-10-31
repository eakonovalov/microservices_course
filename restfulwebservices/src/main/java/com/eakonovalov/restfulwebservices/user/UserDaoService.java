package com.eakonovalov.restfulwebservices.user;

import java.util.List;

public interface UserDaoService {

    List<User> findAll();

    User create(User user);

    User findById(Integer id);

    void deleteById(Integer id);

    List<Post> getPosts(Integer id);

    Post createPost(Integer id, Post post);

}
