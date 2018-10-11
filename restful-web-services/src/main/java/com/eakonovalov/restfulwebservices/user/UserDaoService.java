package com.eakonovalov.restfulwebservices.user;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/**
 * Created by ekonovalov on 2018-10-04.
 */
@Service
public class UserDaoService {

    private static final List<User> users = new ArrayList<>();
    private static int counter = 3;

    static {
        users.add(new User(1, "Adam", new Date()));
        users.add(new User(2, "John", new Date()));
        users.add(new User(3, "Ivan", new Date()));
    }

    public List<User> findAll() {
        return users;
    }

    public User create(User user) {
        if(user.getId() == null) {
            user.setId(++counter);
        }
        users.add(user);

        return user;
    }

    public User findOne(Integer id) {
        if(id == null) return null;

        for(User user : users) {
            if(user.getId().equals(id)) {
                return user;
            }
        }

        return null;
    }

    public User deleteById(Integer id) {
        if(id == null) return null;

        Iterator<User> itr = users.iterator();
        while (itr.hasNext()) {
            User user = itr.next();
            if(user.getId().equals(id)) {
                itr.remove();
                return user;
            }
        }

        return null;
    }

}
