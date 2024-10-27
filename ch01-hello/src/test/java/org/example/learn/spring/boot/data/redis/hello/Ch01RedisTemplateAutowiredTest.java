package org.example.learn.spring.boot.data.redis.hello;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;

@SpringBootTest
public class Ch01RedisTemplateAutowiredTest {

    @Autowired
    private RedisTemplate<Object, Object> redisTemplate;

    /**
     * RedisAutoConfiguration往spring容器中注册是RedisTemplate<Object, Object>类型
     * spring在依赖注入的时候,如果涉及到泛型信息,spring会从class文件中获取到
     */
    @Autowired(required = false)
    private RedisTemplate<String, Object> redisTemplate2;

    @Autowired
    private RedisTemplate<Object, Object> redisTemplate3;

    @Test
    public void test0() {
        System.out.println("redisTemplate = " + redisTemplate);
        System.out.println("redisTemplate2 = " + redisTemplate2);
        System.out.println("redisTemplate3 = " + redisTemplate3);

        Assert.assertNull(redisTemplate2);
        Assert.assertNotNull(redisTemplate);
        Assert.assertEquals(redisTemplate, redisTemplate3);
    }

    @Test
    public void test1() {
        String key = "user:001";
        String value = "zhangSan";

        redisTemplate.opsForValue().set(key, value);
        Object value2 = redisTemplate.opsForValue().get(key);
        System.out.println("value2 = " + value2);
        Assert.assertEquals(value, value2);
    }
}