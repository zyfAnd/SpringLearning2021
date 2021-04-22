package cn.daliandaxue;

import cn.daliandaxue.config.MainConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Authour Zhang Yanfu
 * @Date 2021/4/23 7:02 上午
 * @Email 1105564280@qq.com
 * @WeChat zyfJava
 */
public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig.class);
        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        for (String beanName:beanDefinitionNames) {
            System.out.println(beanName);
        }
    }
}
