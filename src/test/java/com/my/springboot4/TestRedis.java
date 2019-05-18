package com.my.springboot4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import com.my.springboot4.ll.Hero;



@RunWith(SpringRunner.class)
@SpringBootTest
public class TestRedis {
	@Autowired
    RedisTemplate<String ,Object> redisTemplate;

	@Test
	public void get() {
        ArrayList<Object> list=new ArrayList();
        list.add("lijun");
        list.add(100);
		redisTemplate.opsForList().set("dd", 3,"yan");
		System.out.println(redisTemplate.opsForList().range("dd",0,6));

	}
	
}