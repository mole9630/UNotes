package top.mole9630.test;

import org.junit.Test;
import redis.clients.jedis.Jedis;

import java.util.Set;

public class JedisTest {
    @Test
    public void testRedis() {
        // 获取连接
        Jedis jedis = new Jedis("192.168.216.137", 6379);
        jedis.auth("root");

        // 执行操作
        jedis.set("username", "mole9630");
//        jedis.del("username");

        jedis.hset("hash", "addr", "Anhui");

        Set<String> keys = jedis.keys("*");
        System.out.println(keys);

        // 关闭连接
        jedis.close();
    }
}
