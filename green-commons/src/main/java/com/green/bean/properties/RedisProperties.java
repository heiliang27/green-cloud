package com.green.bean.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

@Component
@ConfigurationProperties(prefix = "redis")
public class RedisProperties {

	/** 资源池中最大连接数 */
	private Integer maxActive = 10;

	/** 资源池允许最大空闲的连接数 */
	private Integer maxIdle = 5;

	/** 资源池确保最少空闲的连接数 */
	private Integer minIdle = 0;

	/** 当资源池连接用尽后，调用者的最大等待时间 */
	private Integer maxWaitMillis = 10000;

	private String host = "127.0.0.1";

	private Integer port = 6379;

	private String password = "123456";

	private Integer timeout = 2000;

	private Integer database = 0;

	public JedisPool config(JedisPoolConfig jedisPoolConfig) {
		
		jedisPoolConfig.setMinIdle(minIdle);
		
		jedisPoolConfig.setMaxIdle(maxIdle);
		// 连接池的最大数据库连接数
		jedisPoolConfig.setMaxTotal(maxActive);
		// 最大建立连接等待时间
		jedisPoolConfig.setMaxWaitMillis(maxWaitMillis);
		
		JedisPool jedisPool = new JedisPool(jedisPoolConfig, host, port, timeout, password, database);
		return jedisPool;
	}

}
