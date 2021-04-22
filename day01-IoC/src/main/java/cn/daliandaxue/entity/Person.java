package cn.daliandaxue.entity;

/**
 * @Authour Zhang Yanfu
 * @Date 2021/4/23 7:01 上午
 * @Email 1105564280@qq.com
 * @WeChat zyfJava
 */
public class Person {
    private String name;
    private Integer age;

    public Person() {
        System.out.println("Person init..");
    }

    public Person(String name, Integer age) {
        System.out.println("Person construct has initialized field  init..");
        this.name = name;
        this.age = age;
    }

}
