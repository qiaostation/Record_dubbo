package cc.qiaoo.dubbo.introductory_sample_01;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by liqiaoqiao on 2016/8/19.
 */
public class Consumer {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath*:introductory_sample_01/consumer.xml");
        DemoService demoService = (DemoService) context.getBean("demoService");
        String hello = demoService.sayHello("world");
        System.out.println(hello);
    }
}
