package com.firstspringproject.api1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class apicontroller {
    @GetMapping("/welcome")
    String first_api() {

        return "This is first Spring project";
    }
}
