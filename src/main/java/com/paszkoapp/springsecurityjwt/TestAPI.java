package com.paszkoapp.springsecurityjwt;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//restcontroller gdyż ta klasa będzie dostarczała wszelkiego rodzaju API
@RestController
public class TestAPI {

    @GetMapping("/api/test1")
    public String test1(){

        return "test1";
    }

    @GetMapping("/api/test2")
    public String test2(){

        return "test2";
    }

    @GetMapping("/api/test3")
    public String test3(){

        return "test3";
    }

}
