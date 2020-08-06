package com.guigu.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * @author: kaiyi
 * @create: 2020-08-03 23:53
 */

@Controller
public class LoginController {

  // @PostMapping
  // @GetMapping
  // @PutMapping
  // @RequestMapping(value="/user/login", method = RequestMethod.POST)
  @PostMapping(value="/user/login")
  public String login(@RequestParam("username") String username,
      @RequestParam("password") String password,
      Map<String, Object> map,
      HttpSession session) {
    if(!StringUtils.isEmpty(username) && "123456".equals(password)){

      session.setAttribute("loginUser", username);
      // 登陆成功,防止表单重复提交，可以重定向
      return "redirect:/main.html";
    }else{
      // 登陆失败
      map.put("msg", "用户名密码错误");
      return "login";
    }
  }

}
