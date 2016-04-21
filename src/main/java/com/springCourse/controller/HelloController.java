package com.springCourse.controller;

import java.io.IOException;
import java.io.Writer;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

	@RequestMapping(value = "/users/{userId}")
	public void spring(@PathVariable("userId") String userId, @RequestParam("msg") String msg,
			@RequestHeader("host") String host, Writer writer) throws IOException {
		writer.write("userId="+userId+", msg="+msg+", hostHeader="+host);
	}
	
	@RequestMapping(value = "/users/login")
	@ResponseBody
	public String login(@RequestParam("name") String name, @RequestParam("password") String passwork)
			throws IOException {
		return "Name:"+name+"<br />Passwork:"+passwork;
	}
}
