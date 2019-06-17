package com.example.redis;

import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

/**
 * redis
 *
 * @author Pierre.FAN
 * @date 2019/6/17
 */
@Service
public class RedisTemplateServer {

    @Autowired
    private StringRedisTemplate redisTemplate;

    public <T> boolean set(String key, T value) {

        try {
            String values = BeanToString(value);
            if(values == null||values.length()==0){
                return false;
            }
            redisTemplate.opsForValue().set(key,values);
            return true;
        }catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }

    public <T> T get(String key,Class<T> tClass) {
        try {
            String s = redisTemplate.opsForValue().get(key);
            return StringToBean(s,tClass);
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    @SuppressWarnings("unchecked")
    private <T> T StringToBean(String str, Class<T> clazz) {
        if (str == null || str.length() <= 0 || clazz == null) {
            return null;
        } else if (clazz == int.class || clazz == Integer.class) {
            return (T) Integer.valueOf(str);
        } else if (clazz == long.class || clazz == Long.class) {
            return (T) Long.valueOf(str);
        } else if (clazz == String.class) {
            return (T) str;
        } else {
            return JSON.toJavaObject(JSON.parseObject(str), clazz);
        }
    }

    private  <T> String BeanToString(T bean) {
        if (bean == null) {
            return null;
        }
        Class<?> aClass = bean.getClass();
        if (aClass == int.class || aClass == Integer.class){
            return ""+bean;
        }else if (aClass == int.class || aClass == Integer.class){
            return  ""+bean;
        }else if(aClass == String.class){
            return (String)bean;
        }else {
            return JSON.toJSONString(bean);
        }

    }


}
