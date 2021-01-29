package com.example.demo.controller;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HelloWorldControoler
{
	//expose the api as a webservise so that this API will be available over http protocol
	
  @RequestMapping("/hello")
  public String hello() {
	
	return "hello modern ";
	
		
}
  public static void main(String args[])
  {
	  HelloWorldControoler obj=new HelloWorldControoler();
	  obj.hello();
  }
}
