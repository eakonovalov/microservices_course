package com.eakonovalov.restfulwebservices.user;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by ekonovalov on 2018-10-31.
 */
public interface PostRepository extends JpaRepository<Post, Integer> {
}
