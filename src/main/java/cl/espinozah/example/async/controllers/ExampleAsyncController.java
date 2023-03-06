package cl.espinozah.example.async.controllers;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.espinozah.example.async.services.ExampleAsyncService;

@RestController
public class ExampleAsyncController {

	private final Logger logger = Logger.getLogger(ExampleAsyncController.class.getName());

	@Autowired
	private ExampleAsyncService service;

	@GetMapping("/")
	public String handleGet() {
		logger.info("init handler get");
		service.handleAsyncMethod();
		service.handleMethod();
		logger.info("done handler get");
		return "OK";
	}

}
