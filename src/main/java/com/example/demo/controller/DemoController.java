package com.example.demo.controller;

import java.text.Format;
import java.text.SimpleDateFormat;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	@GetMapping("/getTime")
	public String getCurrentTime()
	{
		Format formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		String s = formatter.format(new java.util.Date());
		return s;
	}
	
}
