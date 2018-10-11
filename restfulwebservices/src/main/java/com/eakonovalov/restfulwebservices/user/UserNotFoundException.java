package com.eakonovalov.restfulwebservices.user;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Created by ekonovalov on 2018-10-04.
 */
@ResponseStatus(HttpStatus.NOT_FOUND)
public class UserNotFoundException extends RuntimeException {

    private static final long serialVersionUID = -5445567106650487257L;

    public UserNotFoundException(String s) {
        super(s);
    }

}
