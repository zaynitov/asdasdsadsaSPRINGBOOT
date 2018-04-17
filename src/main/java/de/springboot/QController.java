package de.springboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController

public class QController {

    @RequestMapping("/hello")
    public ModelAndView index() {
        ModelAndView mav = new ModelAndView("super.html");

        return mav;
    }
}
