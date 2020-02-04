package cn.bobasyu.mapper.sql;

import cn.bobasyu.entity.TbUser;
import org.apache.ibatis.jdbc.SQL;

/**
 * 在不写xml的情况下提供动态SQL语句
 *
 * @author Boba
 */
public class TbUserSqlProvider {

    public String select(TbUser tbUser) {
        SQL sql = new SQL().SELECT("uid", "uname", "password");
        sql.FROM("tbuser");
        if (tbUser.getUid() != null) {
            sql.WHERE("uid = #{uid}");
        }
        if (tbUser.getUname() != null) {
            sql.WHERE("uname = #{uname}");
        }
        if (tbUser.getPassword() != null) {
            sql.WHERE("password = #{password}");
        }
        return sql.toString();
    }
}
