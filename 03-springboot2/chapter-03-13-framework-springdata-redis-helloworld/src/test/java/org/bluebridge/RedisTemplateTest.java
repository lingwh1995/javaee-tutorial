package org.bluebridge;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.bluebridge.Application;
import org.bluebridge.domain.User;
import org.bluebridge.utils.JsonUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.*;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * RedisTemplate 操作测试
 *
 * 1. RedisTemplate：操作的 k-v 都是对象的
 * 2. Redis 五大数据类型：
 *    - String(字符串)： stringRedisTemplate.opsForValue()
 *    - List(列表)： stringRedisTemplate.opsForList()
 *    - Set(集合)： stringRedisTemplate.opsForSet()
 *    - Hash(散列表)： stringRedisTemplate.opsForHash()
 *    - ZSet(有序集合)： stringRedisTemplate.opsForZSet()
 *
 * @author lingwh
 * @date 2019/11/14 10:59
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class RedisTemplateTest {

    @Autowired
    private RedisTemplate redisTemplate;

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    /**
     * 注入自定义的 RedisTempate
     */
    @Autowired
    private RedisTemplate<Object, User> userRedisTemplate;


    @Test
    public void fun1() throws JsonProcessingException {
        System.out.println("-------------------------------------------------------");
        // 操作 String
        ValueOperations<String, String> stringOperator = redisTemplate.opsForValue();
        stringOperator.set("message","Hello Redis!");
        String message = stringOperator.get("message");
        System.out.println("message"+":"+message);
        System.out.println("-------------------------------------------------------");
        // 把对象转换成 Json 格式字符换进行存储，注意：不需要实现序列化接口
        User user = new User("001", "zhangsan", "123456");
        stringOperator.set("user_str", JsonUtils.objectToJson(user));
        String userStr = stringOperator.get("user_str");
        System.out.println("userStr:"+userStr);
        System.out.println("-------------------------------------------------------");
        // 直接对 User 对象进行存储，注意：不需要实现序列化接口
        ValueOperations<String, User> stringOperatorUser = redisTemplate.opsForValue();
        stringOperatorUser.set("user_obj",user);
        User user_obj = stringOperatorUser.get("user_obj");
        System.out.println("user_obj:"+user_obj.toString());

        // 操作 List
        ListOperations<String, String> listOperator = redisTemplate.opsForList();
        // 操作 Set
        SetOperations<String, String> setOperator = redisTemplate.opsForSet();
        // 操作 Hash
        HashOperations<String, Object, Object> hashOperator = redisTemplate.opsForHash();
        // 操作 ZSet
        ZSetOperations<String, String> zSetOperator = redisTemplate.opsForZSet();
    }

    @Test
    public void fun2() throws JsonProcessingException {
        System.out.println("-------------------------------------------------------");
        // 操作 String
        ValueOperations<String, String> stringOperator = stringRedisTemplate.opsForValue();
        stringOperator.set("message","Hello Redis!");
        String message = stringOperator.get("message");
        System.out.println("message"+":"+message);
        System.out.println("-------------------------------------------------------");
        // 把对象转换成 Json 格式字符换进行存储，注意：不需要实现序列化接口
        User user = new User("001", "zhangsan", "123456");
        stringOperator.set("user", JsonUtils.objectToJson(user));
        String userStr = stringOperator.get("user");
        System.out.println("userStr:"+userStr);
        System.out.println("-------------------------------------------------------");
        // 操作 List
        ListOperations<String, String> listOperator = stringRedisTemplate.opsForList();
        // 操作 Set
        SetOperations<String, String> setOperator = stringRedisTemplate.opsForSet();
        // 操作 Hash
        HashOperations<String, Object, Object> hashOperator = stringRedisTemplate.opsForHash();
        // 操作 ZSet
        ZSetOperations<String, String> zSetOperator = stringRedisTemplate.opsForZSet();
    }

    /**
     * 测试自定义的 RedisTempate
     *
     * 使用自定义的 RedisTempate 可以省略序列化步骤，直接传入对象即可
     */
    @Test
    public void fun3(){
        ValueOperations<Object, User> userValueOperator = userRedisTemplate.opsForValue();
        User user = new User("001", "zhangsan", "123456");
        userValueOperator.set("user_customer_redistempate",user);
        User user_customer_redistempate = userValueOperator.get("user_customer");
        System.out.println("user_customer_redistempate"+user_customer_redistempate);
    }
}
