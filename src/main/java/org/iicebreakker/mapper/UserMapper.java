package org.iicebreakker.mapper;

import org.iicebreakker.domain.User;

import java.util.List;

/**
 * 用户信息Mapper
 */
public interface UserMapper {

    /**
     * 根据主键查询用户
     *
     * @param id 主键
     * @return 用户
     */
    User selectById(String id);

    /**
     * 根据查询条件查询用户
     *
     * @param userQo 查询对象
     * @return 用户列表
     */
    List<User> selectByCond(User userQo);

    /**
     * 查询所有用户
     *
     * @return 用户列表
     */
    List<User> selectAll();

}
