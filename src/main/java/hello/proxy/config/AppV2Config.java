package hello.proxy.config;

import hello.proxy.app.v2.OrderControllerV2;
import hello.proxy.app.v2.OrderRepositoryV2;
import hello.proxy.app.v2.OrderServiceV2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppV2Config {
    @Bean
    public OrderControllerV2 orderControllerV2(){
        return new OrderControllerV2(orderServiceV2());
    }

    private OrderServiceV2 orderServiceV2() {
        return new OrderServiceV2(orderRepository());
    }

    private OrderRepositoryV2 orderRepository() {
        return new OrderRepositoryV2();
    }
}
