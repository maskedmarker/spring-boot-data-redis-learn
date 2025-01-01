# redis驱动

## spring关于redis驱动的选择
spring-data-redis中并没有明确指定使用哪个redis驱动
```text
<dependencies>
    <dependency>
        <groupId>redis.clients</groupId>
        <artifactId>jedis</artifactId>
        <version>${jedis}</version>
        <optional>true</optional>
    </dependency>
    <dependency>
        <groupId>io.lettuce</groupId>
        <artifactId>lettuce-core</artifactId>
        <version>${lettuce}</version>
        <optional>true</optional>
    </dependency>
</dependencies>
```

spring-boot-starter-data-redis在其依赖中声明了使用lettuce作为redis驱动
```text
<dependencies>
    <dependency>
      <groupId>org.springframework.data</groupId>
      <artifactId>spring-data-redis</artifactId>
      <version>2.3.2.RELEASE</version>
      <scope>compile</scope>
    </dependency>
    <dependency>
      <groupId>io.lettuce</groupId>
      <artifactId>lettuce-core</artifactId>
      <version>5.3.2.RELEASE</version>
      <scope>compile</scope>
    </dependency>
</dependencies>
```
