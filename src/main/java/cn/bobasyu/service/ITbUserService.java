package cn.bobasyu.service;

import cn.bobasyu.entity.TbUser;

import java.util.List;

/**
 * @author Boba
 */
public interface ITbUserService {

    List<TbUser> select(TbUser tbUser);

    int insert(TbUser tbUser);

    int update(TbUser tbUser);

    int delete(Integer uid);
}
