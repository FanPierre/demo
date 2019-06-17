package com.example.ssmDemo;

import com.example.redis.RedisTemplateServer;
import com.example.redis.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;
import java.sql.SQLException;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class DemoApplicationTests {

    @Autowired
    private StringRedisTemplate redisTemplate;

    @Autowired
    private RedisTemplateServer redisTemplateServer;



//	ApplicationContext applicationContext = new ClassPathXmlApplicationContext("generatorConfig.xml");

	/*@Test
	public void contextLoads() {


        JdbcTemplate jdbcTemplate = new JdbcTemplate();




        String applicationName = applicationContext.getApplicationName();
        System.out.println("applicationName"+jdbcTemplate.getQueryTimeout());
    }*/

    @Test
    public void redisTest(){
	    redisTemplate.opsForValue().set("bbb","223");
        System.out.println("成功");
    }

    @Test
    public void setRedisObjectText(){
        User user1 = new User();
        user1.setName("zhangsan");
        user1.setAge(18);
        user1.setSex("男");
        boolean user2 = redisTemplateServer.set("user", user1);
        if(user2 ==true){
            System.out.println("成功");
        }else if (user2 == false){
            System.out.println("失败");
        }
    }

    @Test
    public void getRedisValue(){
        User user = redisTemplateServer.get("user", User.class);
        System.out.println(user.getSex());
    }

}

