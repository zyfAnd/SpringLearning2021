package cn.daliandaxue.entity;

/**
 * @Authour Zhang Yanfu
 * @Date 2021/4/23 11:19 上午
 * @Email 1105564280@qq.com
 * @WeChat zyfJava
 */
public class Car {
    private String name;
    private String price;

    public Car() {
        System.out.println("car construct init..");
    }

    public String getName() {
        return name;
    }

    public String getPrice() {
        return price;
    }

    /**
     * initiate method
     */
    public void init(){
        System.out.println("car init.");
    }

    public void destory(){
        System.out.println("car destory..");
    }

}
