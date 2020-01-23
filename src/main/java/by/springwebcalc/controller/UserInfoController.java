package by.springwebcalc.controller;

import by.springwebcalc.model.User;
import by.springwebcalc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/users")
public class UserInfoController {
    private UserService service;

    @Autowired
    public UserInfoController(UserService service) {
        this.service = service;
    }

    @GetMapping("/{userId}")
    public ModelAndView getUserInfo(@PathVariable(value = "userId")String id, ModelAndView model) {
        User selectedUser = null;
        for (User user: service.getUsers().values()) {
            if (user.getId() == Integer.parseInt(id)) {
                selectedUser = user;
            }
        }
        model.setViewName("userinfo");
        model.addObject("id", id);
        model.addObject("nickname", selectedUser.getNickname());
        return model;
    }
}
