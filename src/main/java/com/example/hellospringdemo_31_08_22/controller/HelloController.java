package com.example.hellospringdemo_31_08_22.controller;

import org.springframework.cglib.core.Local;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.DayOfWeek;
import java.time.LocalDateTime;

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

  @GetMapping("/echo")
  public String parameter(@RequestParam String mytext){
    return mytext;
  }

  @GetMapping("/isitfriday")
  public String isfriday(){
    String output = "If it friday today?";
    if(LocalDateTime.now().getDayOfWeek().equals(DayOfWeek.FRIDAY))
      return output+= "  YES";
    else return output+= "  NO";
  }
}
