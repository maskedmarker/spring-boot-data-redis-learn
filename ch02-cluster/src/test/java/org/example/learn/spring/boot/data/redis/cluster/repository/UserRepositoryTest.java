package org.example.learn.spring.boot.data.redis.cluster.repository;

import org.example.learn.spring.boot.data.redis.commons.model.user.po.UserPO;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    void save() {
        UserPO userPO = new UserPO();
        userPO.setId("100");
        userPO.setName("zhangSan");
        userPO.setAge(20);
        userRepository.save(userPO);
    }

    @Test
    void findById() {
        String id = "100";
        UserPO userPO = userRepository.findById(id);
        Assertions.assertNull(userPO);
    }

    @Test
    void delete() {
        String id = "100";
        userRepository.delete(id);
    }
}