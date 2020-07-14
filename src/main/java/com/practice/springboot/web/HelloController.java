package com.practice.springboot.web; //Controller classes

import com.practice.springboot.web.dto.HelloResponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController //json을 반환하는 controller
public class HelloController {
    @GetMapping("/hello") //http GET method 요청받는 API 만듦, /hello 요청 -> hello 반환
    public String hello(){
        return "hello";
    }

    @GetMapping("/hello/dto")
    public HelloResponseDto helloDto(@RequestParam("name") String name, //외부에서 API로 넘긴 파라미터 가져옴
                                     @RequestParam("amount") int amount){
        return new HelloResponseDto(name,amount);
    }

}



