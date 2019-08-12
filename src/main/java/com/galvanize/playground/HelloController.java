package com.galvanize.playground;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String helloWorld(){
        return "Hello";
    }

    @GetMapping("/profile")
    public String getProfile(){
        return "Profile";
    }

    @GetMapping("/math/pi")
    public String getPi(){
        return "3.141592653589793";
    }

}
