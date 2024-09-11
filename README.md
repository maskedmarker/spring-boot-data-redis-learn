# 关于spring-data-redis的学习



## 注意
1. RedisAutoConfiguration为自动在spring容器中放入一个redisTemplate,请注意类型是RedisTemplate<Object, Object>
2. 如果应用代码中声明的@Autowired的redisTemplate的类型不是严格的RedisTemplate<Object, Object>,那么将报错.