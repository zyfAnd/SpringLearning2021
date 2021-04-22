package cn.daliandaxue.config;

import cn.daliandaxue.entity.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Authour Zhang Yanfu
 * @Date 2021/4/23 7:00 上午
 * @Email 1105564280@qq.com
 * @WeChat zyfJava
 */
@Configuration
@ComponentScan(basePackages = "cn.daliandaxue")
public class MainConfig {

    @Bean
    Person getPerson(){
        return new Person("Yanfu",18);
    }
}
