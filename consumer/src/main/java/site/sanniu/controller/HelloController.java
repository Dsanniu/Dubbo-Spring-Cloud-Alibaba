package site.sanniu.controller;

import org.apache.dubbo.config.annotation.Reference;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import site.sanniu.HelloService;

/**
 * @ClassName: HelloController
 * @Description: TODO
 * @Author: sanniu
 * @Date: 2020/5/6 0006 16:24
 * @Version: 1.0
 */
@RestController
@RequestMapping("/test")
public class HelloController {

    @Reference(check = false,timeout = 2000,retries = 5)
    private HelloService helloService;

    @GetMapping("/say")
    public String say(){
        return helloService.hello("段犇");
    }

    @GetMapping("/talk")
    public String talk(){
        return "我是talk";
    }
}
