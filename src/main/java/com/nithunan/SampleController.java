package com.nithunan;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

	@GetMapping(path = "/hello")
	public String getEmployees() {
		return "Hello World";
	}

}
