package com.example.redis;

import ch.qos.logback.core.util.TimeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.TimeoutUtils;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.concurrent.TimeUnit;

/**
 * redis
 *
 * @author Pierre.FAN
 * @date 2019/6/16
 */
@Service
public class redisServer {
    @Autowired
    private StringRedisTemplate redisTemplate;

    /*public Boolean Set(String key, Object value) {
        Boolean result = false;
        try {
            //操作字符串，设置值
            ValueOperations<Serializable, Object> redisValue = redisTemplate.opsForValue();
            redisValue.set(key, value);
            result = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    *//**
     * 写入缓存设置有效时间
     *
     * @param key
     * @param value
     * @param time
     * @return
     *//*
    public Boolean setTime(String key, Object value, Long time) {
        Boolean result = false;
        try {
            ValueOperations valueOperations = redisTemplate.opsForValue();
            valueOperations.set(key, value);
            Boolean expire = redisTemplate.expire(key, time, TimeUnit.SECONDS);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;

    }

    *//**
     * 批量删除对应的value
     * @param keys
     * @return
     *//*
    public Boolean remove(final String... keys){
        Boolean result=false;
        try {
            for (String str:keys
                 ) {
                remove(str);

            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return  result;
    }*/



}
