package jp.sample.server.model.user;

public interface UserRepository {
    public User findById( UserId userId );
    public UserList listAll();
    public User register( User user );
    public User modify( User user );
}
