# 关于spring-data-redis的学习


## RedisTemplate
1. RedisAutoConfiguration为自动在spring容器中放入一个redisTemplate,请注意类型是RedisTemplate<Object, Object>
2. 如果应用代码中声明的@Autowired的redisTemplate的类型不是严格的RedisTemplate<Object, Object>,那么将报错.

## redis配置项
1. 不同版本的redis密码的配置项不同
2. 比如2.2.2.RELEASE中,密码的配置项名为spring.redis.password;而2.2.2.RELEASE中密码的配置项名为spring.redis.cluster.password


## 注意

