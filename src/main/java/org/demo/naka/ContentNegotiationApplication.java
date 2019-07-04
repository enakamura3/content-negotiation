package org.demo.naka;

import org.demo.naka.model.Request;
import org.demo.naka.model.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ContentNegotiationApplication {

	private static final Logger logger = LoggerFactory.getLogger(ContentNegotiationApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(ContentNegotiationApplication.class, args);
	}
	
	@GetMapping("/get")
	public Response getMethod(@RequestParam int id) {
		return Response.builder().id(id).message("get method called").build();
	}
	
	@PostMapping("/post")
	public Response postMethod(@RequestBody Request request) {
		logger.info("request: {}", request);
		return Response.builder().id(request.getId()).message(String.format("Hello %s", request.getName())).build();
	}
}