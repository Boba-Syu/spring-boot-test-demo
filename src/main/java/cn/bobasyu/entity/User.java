package cn.bobasyu.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * 测试用实体类
 *
 * @author Boba
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Document("user")
public class User {
    private Long id;
    private String userName;
    private String password;
}
