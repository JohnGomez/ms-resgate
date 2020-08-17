package br.com.msresgate.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/login")
public class LoginController {

    @RequestMapping("")
    public ModelAndView getForm() {
      return new ModelAndView("/login");
    }

}
