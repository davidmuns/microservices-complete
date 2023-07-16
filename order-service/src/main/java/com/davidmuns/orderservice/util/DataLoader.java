package com.davidmuns.orderservice.util;

import com.davidmuns.orderservice.model.Order;
import com.davidmuns.orderservice.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import java.util.UUID;

@Component
@RequiredArgsConstructor
public class DataLoader implements CommandLineRunner {


   private final OrderRepository orderRepository;

    @Override
    public void run(String... args) throws Exception {
//        if (orderRepository.count() < 1) {
            Order order = new Order();
            order.setOrderNumber(UUID.randomUUID().toString());
            orderRepository.save(order);
//        }
    }
}
