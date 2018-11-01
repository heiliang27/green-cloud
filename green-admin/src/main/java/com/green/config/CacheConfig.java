package com.green.config;

import java.lang.reflect.Method;

import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.interceptor.KeyGenerator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.data.redis.connection.RedisConnectionFactory;

/**
 * @author limingliang
 * @version 2018年11月1日 下午4:20:17 
 */
@Configuration
@EnableCaching
public class CacheConfig {
	
	/** 配置spring缓存  */
	@Bean
	public RedisCacheManager cacheManager(RedisConnectionFactory connectionFactory){		
		return RedisCacheManager.create(connectionFactory);
	}

	@Bean
	public KeyGenerator keyGenerator() {
		return new KeyGenerator() {
			public Object generate(Object target, Method method, Object... objects) {
				StringBuilder sb = new StringBuilder();
				sb.append(target.getClass().getName());
				sb.append(method.getName());
				for (Object obj : objects) {
					sb.append(obj.toString());
				}
				return sb.toString();
			}
		};
	}
}
