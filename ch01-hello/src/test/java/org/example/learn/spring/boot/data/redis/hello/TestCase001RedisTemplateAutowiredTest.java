package org.example.learn.spring.boot.data.redis.hello;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;

import java.util.HashMap;
import java.util.Map;

@SpringBootTest
public class TestCase001RedisTemplateAutowiredTest {

    @Autowired
    private RedisTemplate<Object, Object> redisTemplate;

    @Autowired(required = false)
    private RedisTemplate<String, Object> redisTemplate2;

    @Test
    public void test0() {
        System.out.println("redisTemplate = " + redisTemplate);
        System.out.println("redisTemplate2 = " + redisTemplate2);
    }

    /**
     * 方法体中的泛型信息都被擦除了
     */
    @Test
    public void test1() {
        Map<String, Object> map = new HashMap<>();
        map.put("key1", "value1");
        map.put("key2", "value2");
        System.out.println("map = " + map);
    }
}