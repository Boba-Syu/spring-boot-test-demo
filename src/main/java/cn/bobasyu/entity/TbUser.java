package cn.bobasyu.entity;

import lombok.Data;
/**
 * h2DB MyBatis 通用mapper的测试实体类
 *
 * @author Boba
 */
@Data
public class TbUser {
    private Integer uid;
    private String uname;
    private String password;
}
