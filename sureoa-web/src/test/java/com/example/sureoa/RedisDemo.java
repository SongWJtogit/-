package com.example.sureoa;

import org.junit.Test;
import redis.clients.jedis.Jedis;

public class RedisDemo {
    @Test
    public  void setkEY(){
        Jedis jedis = new Jedis("127.0.0.1",6379);
        jedis.set("name","吴小红");
        String SbName = jedis.get("name");
        System.out.println(SbName);
    }
}
