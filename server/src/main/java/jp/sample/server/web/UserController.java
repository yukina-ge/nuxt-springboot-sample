package jp.sample.server.web;

import jp.sample.server.model.user.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {
    @Autowired
    private UserRepository repository;

    @GetMapping
    public UserList users() {
        UserList userList = repository.listAll();
        return userList;
    }

    @GetMapping("{userId:[\\d]}")
    public User user( @PathVariable("userId") Long userId ) {
        User user = repository.findById( new UserId( userId ));
        return user;
    }

    @PostMapping("new")
    public User newUser( @RequestAttribute("user") User user ) {
        return repository.register(user);
    }

    @PostMapping
    public User editUser( @RequestAttribute("user") User user ) {
        return repository.modify(user);
    }
}
