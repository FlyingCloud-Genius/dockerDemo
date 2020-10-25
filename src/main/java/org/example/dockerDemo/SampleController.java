package org.example.dockerDemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {
    
    @GetMapping(value = "/hello")
    public String hello() {
        return "hello world!";
    }
}
