package cc.qiaoo.dubbo.introductory_sample_01;

/**
 * Created by liqiaoqiao on 2016/8/19.
 */
public class DemoServiceImpl implements DemoService {
    @Override
    public String sayHello(String name) {
        return "Hello " + name;
    }
}
