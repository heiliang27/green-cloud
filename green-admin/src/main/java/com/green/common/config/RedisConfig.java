package com.green.common.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.green.bean.properties.RedisProperties;

import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

@Configuration
public class RedisConfig {

	@Autowired
	private RedisProperties redisProperties;

	/** JedisPoolConfig 连接池 */
	@Bean
	public JedisPool jedisPoolConfig() {
		JedisPoolConfig jedisPoolConfig = new JedisPoolConfig();
		JedisPool jedisPool = redisProperties.config(jedisPoolConfig);
		return jedisPool;
	}
}
