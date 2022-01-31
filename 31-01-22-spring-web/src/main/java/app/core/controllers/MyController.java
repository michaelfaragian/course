package app.core.controllers;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	// when we map an endpoint ew ddefine:
	// 1. http method
	// 2. path
	// http://localhost:8080/hello
	@RequestMapping(method = RequestMethod.GET, path = {"/x" , "/y" ,"/z"})
	public String hello() {
		System.out.println("method");
		return "date: " + LocalDateTime.now();
	}
	// http://localhost:8080/sum?a=5&&b=3
	@RequestMapping(method = RequestMethod.GET, path = "/sum")
	public int sum(@RequestParam int a,@RequestParam int b) {
		return a + b;
	}
	@RequestMapping(method = RequestMethod.GET, path = "/sum2")
	public String sum2(@RequestParam int a,@RequestParam int b) {
		return a +"+ " + b + "=" +(a+b);
	}

}
