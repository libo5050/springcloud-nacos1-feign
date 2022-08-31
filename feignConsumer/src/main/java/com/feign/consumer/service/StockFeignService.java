package com.feign.consumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "stock-service") //生产者服务名:stock-service
@RequestMapping(value = "/stock")
public interface StockFeignService {

    @RequestMapping("/reduce")
    String reduce();
}
