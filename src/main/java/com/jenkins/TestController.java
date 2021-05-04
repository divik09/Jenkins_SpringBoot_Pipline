package com.jenkins;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping()
	public String test() {
		return "<h1 align='center' style='color:red'>This is Testing website Successfully Launched !!!</h1>";
	}
}
