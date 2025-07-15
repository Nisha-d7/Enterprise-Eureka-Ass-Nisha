package com.week10.nisha;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {

    @GetMapping("/info")
    public String getInfo() {
        return "REST Server is running";
    }
}
