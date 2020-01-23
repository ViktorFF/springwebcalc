package by.springwebcalc.controller;

import by.springwebcalc.model.User;
import by.springwebcalc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping(path = "/edit")
public class EditController {
    private UserService service;

    @Autowired
    private EditController(UserService service) {
        this.service = service;
    }

    @GetMapping
    public ModelAndView editGet(String fieldEdit, HttpSession session, ModelAndView model) {
        User user = (User) session.getAttribute("currentUser");
        model.setViewName("edit");
        model.addObject("field", fieldEdit);
        model.addObject("oldValue", service.oldValue(fieldEdit, user));
        return model;
    }

    @PostMapping
    public String editPost(String field, String newValue, HttpSession session, ModelAndView model) {
        User user = (User) session.getAttribute("currentUser");
        model.setViewName("edit");
        service.setNewValue(field, newValue, user);
        return "redirect:/profile";
    }
}
