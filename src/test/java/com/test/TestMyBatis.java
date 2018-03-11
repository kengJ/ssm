package com.test;

import javax.annotation.Resource;
import org.junit.Test;
import org.apache.log4j.Logger;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.alibaba.fastjson.JSON;
import com.model.User;
import com.service.IUserService;

import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;
	
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring-mybatis.xml" })
public class TestMyBatis {
	private static Logger logger = Logger.getLogger(TestMyBatis.class);
	@Resource
	private IUserService userService = null;
	
	@Test
	public void test() {
		// TODO Auto-generated method stub
		User user = userService.getUserById(1);
		logger.info(user);
		logger.info("user转为json");
		logger.info(JSON.toJSONString(user));
	}
	
//	@Test
//	public void testRedis(){
//		System.out.println("测试redis");
//		Configuration conf=Configuration.getInstance();
//		String JEDIS_IP=conf.getString("jedis.ip","127.0.0.1");
//       int JEDIS_PORT=conf.getInt("jedis.port",6379);
//       String JEDIS_PASSWORD=conf.getString("jedis.password",null);
//        JedisPoolConfig config=new JedisPoolConfig();
//        config.setMaxIdle(5000);
//        config.setMaxIdle(256);
//        config.setMaxWaitMillis(5000L);
//        config.setTestOnBorrow(true);
//        config.setTestOnReturn(true);
//        config.setTestWhileIdle(true);
//        config.setMinEvictableIdleTimeMillis(60000L);
//        config.setTimeBetweenEvictionRunsMillis(3000L);
//        config.setNumTestsPerEvictionRun(-1);
//        JedisPool jedisPool=new JedisPool(config,JEDIS_IP,JEDIS_PORT,60000);
//	}
}
