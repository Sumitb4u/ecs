package com.example.ecs;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class aController{
    @GetMapping(path = "/getname",produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody String getName(@RequestParam String name) throws Exception{
        String namevalue = "hello";
        return namevalue;
    }
}
