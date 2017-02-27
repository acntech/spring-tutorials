package no.acntech.tutorial.spring.controller;

import no.acntech.tutorial.spring.service.DummyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DummyController {

    private final DummyService service;

    @Autowired
    public DummyController(final DummyService service) {
        this.service = service;
    }

    @RequestMapping("/")
    public ModelAndView index(ModelAndView modelAndView) {
        modelAndView.addObject("info", service.findInfo());
        modelAndView.setViewName("index");
        return modelAndView;
    }
}
