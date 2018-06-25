package cn.jarod.securitydemo.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloSpringBoot {


  @RequestMapping(value={"/say/{code}"})
  public String say(@PathVariable("code") String str){
    return "id:"+str;
  }

  @RequestMapping(value={"/say"})
  public String say2(@RequestParam("id") String myId){
    return "id:"+myId;
  }

  //负责处理/index.html的请求
  @RequestMapping(value = {"/" , "/index.html"})//可配置多个映射路径
  public String loginPage(){
    return "login";
  }
}
