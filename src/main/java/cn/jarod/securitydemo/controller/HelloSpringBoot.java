package cn.jarod.securitydemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/hello")
public class HelloSpringBoot {


  @RequestMapping(value={"/say"})
  public String say(@RequestParam("id") Integer myId){
    return "id:"+myId;
  }
}
