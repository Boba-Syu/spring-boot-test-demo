package cn.bobasyu.mapper;

import cn.bobasyu.entity.TbUser;

import cn.bobasyu.mapper.sql.TbUserSqlProvider;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * mybatis操作测试用
 *
 * @author Boba
 */
@Repository
public interface TbUserMapper {

    @SelectProvider(type = TbUserSqlProvider.class, method = "select")
    List<TbUser> select(TbUser tbUser);

    @Insert("insert into tbuser " +
            "values(#{uid}, #{uname}, #{password})")
    int insert(TbUser tbUser);

    @Update("update tbuser " +
            "set uname = #{uname}, password = #{password} " +
            "where uid = {#uid}")
    int update(TbUser tbUser);

    @Delete("delete from tbuser where uid = #{uid}")
    int delete(Integer uid);
}
