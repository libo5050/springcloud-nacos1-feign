package com.feign.client.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/stock")
public class stockController {

    @RequestMapping(value = "/reduce")
    public String reduce() {
        return "abc";
    }

}
