package com.eakonovalov.restfulwebservices.user;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by ekonovalov on 2018-10-11.
 */
@Repository
public interface UserRepository extends CrudRepository<User, Integer> {
}
