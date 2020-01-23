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

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping(path = "/auth")
public class AuthenticationController {
    private UserService service;

    @Autowired
    private AuthenticationController(UserService service) {
        this.service = service;
    }

    @GetMapping
    public ModelAndView authGet(ModelAndView model) {
        model.setViewName("auth");
        model.addObject("newUser", new User());
        return model;
    }

    @PostMapping
    public ModelAndView authPost(@ModelAttribute("newUser") User newUser, HttpSession session, ModelAndView model) {
        User user = service.authentication(newUser);
        if (user != null) {
            session.setAttribute("currentUser", user);
            model.setViewName("redirect:/calculator");
        } else {
            model.setViewName("auth");
        }
        return model;
    }
}
