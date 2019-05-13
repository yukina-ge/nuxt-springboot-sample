package jp.sample.server.datasource.user;

import jp.sample.server.model.user.User;
import jp.sample.server.model.user.UserId;
import jp.sample.server.model.user.UserList;
import jp.sample.server.model.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDataSource implements UserRepository {

    @Autowired
    private UserMapper mapper;

    @Override
    public User findById(UserId userId) {
        return mapper.findById(userId);
    }

    @Override
    public UserList listAll() {
        List<User> users = mapper.listAll();

        if(users == null) return new UserList();

        return new UserList(users);
    }

    @Override
    public User register(User user) {
        return new User();
    }

    @Override
    public User modify(User user) {
        return user;
    }
}
