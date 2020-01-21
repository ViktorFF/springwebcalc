package by.springwebcalc.controller;

import by.springwebcalc.service.AuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping(path = "/auth")
public class AuthenticationController {
    private AuthenticationService authenticationService;

    @Autowired
    private AuthenticationController(AuthenticationService authenticationService) {
        this.authenticationService = authenticationService;
    }

    @GetMapping
    public ModelAndView authGet(ModelAndView model) {
        model.setViewName("auth");
        return model;
    }

    @PostMapping
    public ModelAndView authPost(String login, String password,
                                 HttpServletRequest req, ModelAndView model) {
        model.setViewName(authenticationService.authentication(login, password, req));
        return model;
    }
}
