package org.example.learn.spring.boot.data.redis.hello.repository;

import org.example.learn.spring.boot.data.redis.commons.model.user.po.UserPO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {

    private static final String KEY = "UserPO";

    @Autowired
    private RedisTemplate<Object, Object> redisTemplate;

    public void save(UserPO UserPO) {
        redisTemplate.opsForHash().put(KEY, UserPO.getId(), UserPO);
    }

    public UserPO findById(String id) {
        return (UserPO) redisTemplate.opsForHash().get(KEY, id);
    }

    public void delete(String id) {
        redisTemplate.opsForHash().delete(KEY, id);
    }
}