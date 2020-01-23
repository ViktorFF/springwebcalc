package by.springwebcalc.controller;

import by.springwebcalc.model.User;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping(path = "/profile")
public class ProfileController {

    @GetMapping
    public ModelAndView profileGet(ModelAndView model, HttpSession session) {
        User user = (User) session.getAttribute("currentUser");
        model.setViewName("profile");
        model.addObject("id", user.getId());
        model.addObject("nickname", user.getNickname());
        model.addObject("login", user.getLogin());
        model.addObject("password", user.getPassword());
        return model;
    }
}
