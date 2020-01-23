package by.springwebcalc.controller;

import by.springwebcalc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(path = "/users")
public class UsersController {
    private UserService service;

    @Autowired
    public UsersController(UserService service) {
        this.service = service;
    }

    @GetMapping
    public ModelAndView usersGet(ModelAndView model) {
        model.setViewName("users");
        model.addObject("users", service.getUsers().values());
        return  model;
    }
}
