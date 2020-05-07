package site.sanniu.conig;

import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

/**
 * @ClassName: AuthGlobalFilter
 * @Description: 拦截器 可以用来认证
 * @Author: sanniu
 * @Date: 2020/5/7 0007 15:56
 * @Version: 1.0
 */
@Component
public class AuthGlobalFilter implements GlobalFilter, Ordered {
    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        System.out.println("我是拦截器");
        return chain.filter(exchange);
    }

    @Override
    public int getOrder() {
        return 0;
    }
}
