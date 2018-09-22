package simple.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/")
    public String home() {
        return "Hello";
    }

    @RequestMapping("/health")
    public String health() {
        return "OK";
    }
}
