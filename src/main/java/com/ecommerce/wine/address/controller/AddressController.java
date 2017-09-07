package com.ecommerce.wine.address.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.ApiResponse;

@RequestMapping("v1")
@RestController
public class AddressController {
	
	@ApiOperation(httpMethod = "GET", value = "Test service", nickname="test")
	@ApiResponses(value = { 
			@ApiResponse(code = 400, message = "Bad request"),
		    @ApiResponse(code = 404, message = "Not found"),
		    @ApiResponse(code = 500, message = "Internal server error"),
		    @ApiResponse(code = 501, message = "Service not implemented"),
			})
	 @RequestMapping("/address/new/state/{idCountry}")
	 public int newState(@RequestParam int idCountry) {
		return 1;
	}
}
