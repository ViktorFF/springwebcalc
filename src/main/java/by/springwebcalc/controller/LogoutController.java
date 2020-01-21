package by.springwebcalc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping(path = "/logout")
public class LogoutController {

    @GetMapping
    public String logout(HttpServletRequest req){
        HttpSession httpSession = req.getSession();
        httpSession.invalidate();
        return "redirect:/views/";
    }
}
