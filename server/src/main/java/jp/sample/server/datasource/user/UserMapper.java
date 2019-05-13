package jp.sample.server.datasource.user;

import jp.sample.server.model.user.User;
import jp.sample.server.model.user.UserId;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserMapper {
    public User findById(@Param("userId") UserId userId);
    public List<User> listAll();
}
