package by.springwebcalc.controller;

import by.springwebcalc.model.User;
import by.springwebcalc.service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@Controller
@RequestMapping(path = "/reg")
public class RegistrationController {
    private RegistrationService registrationService;

    @Autowired
    private RegistrationController(RegistrationService registrationService) {
        this.registrationService = registrationService;
    }

    @GetMapping
    public ModelAndView registrationGet(ModelAndView model) {
        model.setViewName("reg");
        return model;
    }

    @PostMapping
    public ModelAndView registrationPost(String nickname, String login, String password,
                                         HttpServletRequest req, ModelAndView model) {
        Map<String, User> users = (Map<String, User>) req.getServletContext().getAttribute("users");
        model.setViewName(registrationService.registration(nickname, login, password, users));
        return model;
    }
}
