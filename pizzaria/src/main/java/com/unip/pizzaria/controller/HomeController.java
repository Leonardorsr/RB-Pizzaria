package com.unip.pizzaria.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

public class HomeController {
  @RequestMapping("/")
  public ModelAndView irParaAHome() {
    ModelAndView modelAndView = new ModelAndView("index");

    return modelAndView;
  }
}
