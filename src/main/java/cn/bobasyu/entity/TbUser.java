package cn.bobasyu.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * h2DB MyBatis 通用mapper的测试实体类
 *
 * @author Boba
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TbUser {
    private Integer uid;
    private String uname;
    private String password;
}
