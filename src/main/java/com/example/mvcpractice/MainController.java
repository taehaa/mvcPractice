package com.example.mvcpractice;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

    @RequestMapping("/")
    public ModelAndView index () {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("main");
        return mv;
    }

    @RequestMapping("/main")
    public ModelAndView main () {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("main2");
        return mv;
    }
}
