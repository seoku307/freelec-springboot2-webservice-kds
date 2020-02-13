package com.kds.book.springboot.web;

import com.kds.book.springboot.web.dto.HelloResponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/*
    @RestController : 컨트롤러를 JSON을 반환하는 컨트롤러로 만들어 준다.
    @GetMapping : HTTP인 Method인 Get의 요청을 받을 수 있는 API를 만들어 줍니다.
    * 예전에는 @RequestMapping으로 사용
 */
@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello() {
        return "hello";

    }

    @GetMapping("/hello/dto")
    public HelloResponseDto helloDto(@RequestParam("name") String name, @RequestParam("amount") int amount) {

        return new HelloResponseDto(name, amount);
    }

}
