package com.example.demo.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

//@Api(value = "Swagger2WelcomeRestController", description = "This REST Api related to Welcome Message!!!!")
/*@Api—–> Narrates the description about what in general is the responsibility of the controller.*/
@RestController("/rest/")
public class WelcomeRestController {
	//@ApiOperation(value = "Get Welcome Message For The Given Name ", response = String.class, tags = "getWelcomeNote")
	/* This annotation generate method level docs */
	/* @ApiOperation—-> Narrates the responsibility of the specific method. */
	@GetMapping("/welcome")
	public String welcome() {
		return "Welcome to Restful Services..!!";

	}
	
	@GetMapping("/getStudentData")
	public List studentData() {
		List stdList= new ArrayList();
		stdList.add("Param");
		stdList.add("Sandip");
		stdList.add("Ram");
		stdList.add("Diaga");
		return stdList;
		
	}
	
	

}
