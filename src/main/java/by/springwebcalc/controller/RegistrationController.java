package by.springwebcalc.controller;


import by.springwebcalc.model.User;
import by.springwebcalc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(path = "/reg")
public class RegistrationController {
    private UserService service;

    @Autowired
    public RegistrationController(UserService service) {
        this.service = service;
    }

    @GetMapping
    public ModelAndView registrationGet(ModelAndView model) {
        model.setViewName("reg");
        model.addObject("newUser", new User());
        return model;
    }

    @PostMapping
    public ModelAndView registrationPost(@ModelAttribute("newUser") User newUser, ModelAndView model) {
        if (service.registration(newUser)) {
            model.setViewName("index");
        } else {
            model.setViewName("reg");
        }
        return model;
    }
}
