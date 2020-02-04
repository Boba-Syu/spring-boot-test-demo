package cn.bobasyu;

import cn.bobasyu.entity.User;
import cn.bobasyu.repository.UserRepository;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class SpringBootTestDemoApplicationTests {
    @Autowired
    private UserRepository userRepository;

    @Test
    void insert() {
        User user = new User(1L, "boba", "123456");
        userRepository.saveUser(user);
    }

    @Test
    void select() {
        User user = userRepository.findUserByUserId(1L);
        System.out.println(user);
    }

    @Test
    void update() {
        User user = userRepository.findUserByUserId(1L);
        user.setUserName("bobasyu");
        long result = userRepository.updateUser(user);
        Assert.assertEquals(result,1L);
    }

    @Test
    void delete() {
        long result = userRepository.deleteUserById(1L);
        Assert.assertEquals(result, 1L);
    }
}
