package com.board.boardspirng.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@GetMapping("test/helloStr")
	public String HelloStr() {
		System.out.println("helloStr");
		return "hello";
	}
	
	@GetMapping("test/hello")
    public List<String> Hello(){		
        return Arrays.asList("서버 포트는 8081", "리액트 포트는 3000");
    }

}
