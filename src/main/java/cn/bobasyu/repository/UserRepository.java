package cn.bobasyu.repository;

import cn.bobasyu.entity.User;

/**
 * MongoDB操作接口
 *
 * @author Boba
 */
public interface UserRepository {
    /**
     * 插入User对象
     *
     * @param user 添加的User对象
     */
    void saveUser(User user);

    /**
     * 根据用户ID查询用户
     *
     * @param userId 查询的用户ID
     * @return 查询到的用户
     */
    User findUserByUserId(Long userId);

    /**
     * 更新用户信息
     *
     * @param user 需要更新的用户信息
     * @return 成功更新的数据数目
     */
    long updateUser(User user);

    /**
     * 删除用户
     *
     * @param id 删除的用户ID
     * @return 成功删除的数据数目
     */
    long deleteUserById(Long id);
}
