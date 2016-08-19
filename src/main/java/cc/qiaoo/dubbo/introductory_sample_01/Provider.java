package cc.qiaoo.dubbo.introductory_sample_01;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created by liqiaoqiao on 2016/8/19.
 */
public class Provider {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath*:introductory_sample_01/provider.xml");
        context.start();
        System.in.read();
    }
}
