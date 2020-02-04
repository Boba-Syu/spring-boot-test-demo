package cn.bobasyu.repository.impl;

import cn.bobasyu.entity.User;
import cn.bobasyu.repository.UserRepository;
import com.mongodb.client.result.DeleteResult;
import com.mongodb.client.result.UpdateResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Component;

/**
 * MongoDB操作的实体类
 *
 * @author Boba
 */
@Component
public class UserRepositoryImpl implements UserRepository {
    private final MongoTemplate mongoTemplate;

    @Autowired
    public UserRepositoryImpl(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }

    @Override
    public void saveUser(User user) {
        mongoTemplate.save(user);
    }

    @Override
    public User findUserByUserId(Long userId) {
        Query query = new Query(Criteria.where("_id").is(userId));
        return mongoTemplate.findOne(query, User.class);
    }

    @Override
    public long updateUser(User user) {
        Query query = new Query(Criteria.where("_id").is(user.getId()));
        Update update = new Update().set("userName", user.getUserName()).set("password", user.getPassword());
        //更新查询返回结果集的第一条
        UpdateResult result = mongoTemplate.updateFirst(query, update, User.class);
        //更新查询返回结果集的所有
        // mongoTemplate.updateMulti(query,update,UserEntity.class);
        return result.getMatchedCount();
    }

    @Override
    public long deleteUserById(Long id) {
        Query query = new Query(Criteria.where("_id").is(id));
        DeleteResult result = mongoTemplate.remove(query, User.class);
        return result.getDeletedCount();
    }
}
