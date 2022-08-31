package com.example.hellospringdemo_31_08_22.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

  @GetMapping("/hellospring")
  public String helloSpring(){
    return "Hello Spring";
  }

  @GetMapping("")
  public String defaultPage(){
    return "Hello Motherfucker";
  }

  @GetMapping("/parametertest")
  public String parameter(@RequestParam String mytext, @RequestParam String mySecondText){
    return mytext + " | " + mySecondText;
  }

}
