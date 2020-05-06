package site.sanniu.service;

import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;
import site.sanniu.HelloService;

/**
 * @ClassName: HelloServiceImpl
 * @Description: TODO
 * @Author: sanniu
 * @Date: 2020/5/6 0006 16:22
 * @Version: 1.0
 */
@org.apache.dubbo.config.annotation.Service(timeout = 5000,retries = 5)
@Component
public class HelloServiceImpl implements HelloService {
    
    @Override
    public String hello(String name) {
        return "哈哈哈" + name;
    }
}
