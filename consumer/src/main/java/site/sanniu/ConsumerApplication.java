package site.sanniu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName: site.sanniu.ConsumerApplication
 * @Description: TODO
 * @Author: sanniu
 * @Date: 2020/5/6 0006 16:17
 * @Version: 1.0
 */
@EnableDiscoveryClient
@SpringBootApplication
public class ConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class, args);
    }

}
