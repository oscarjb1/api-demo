package com.test.apidemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping(value="hello")
public class HelloController {
    
    @GetMapping
	public String hola(){
        log.info("hola mundo");
		return "Hola mundo";
	} 
}
