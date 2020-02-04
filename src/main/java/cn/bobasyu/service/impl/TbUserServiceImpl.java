package cn.bobasyu.service.impl;

import cn.bobasyu.entity.TbUser;
import cn.bobasyu.mapper.TbUserMapper;
import cn.bobasyu.service.ITbUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Boba
 */
@Service
public class TbUserServiceImpl implements ITbUserService {
    private TbUserMapper tbUserMapper;

    @Autowired
    public TbUserServiceImpl(TbUserMapper tbUserMapper) {
        this.tbUserMapper = tbUserMapper;
    }

    @Override
    public List<TbUser> select(TbUser tbUser) {
        return tbUserMapper.select(tbUser);
    }

    @Override
    public int insert(TbUser tbUser) {
        return tbUserMapper.insert(tbUser);
    }

    @Override
    public int update(TbUser tbUser) {
        return tbUserMapper.update(tbUser);
    }

    @Override
    public int delete(Integer uid) {
        return tbUserMapper.delete(uid);
    }
}
