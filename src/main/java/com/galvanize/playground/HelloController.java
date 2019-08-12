package com.galvanize.playground;

import org.springframework.web.bind.annotation.*;

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

    @PatchMapping("/math/volume/6/7/8")
    public String getCommentsForTask() {
        return "The volume of a 6x7x8 rectangle is 336";
    }


}
