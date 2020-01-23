package by.springwebcalc.controller;

import by.springwebcalc.model.Operation;
import by.springwebcalc.service.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping(path = "/calculator")
public class CalculatorController {
    private CalculatorService service;

    @Autowired
    private CalculatorController(CalculatorService service) {
        this.service = service;
    }

    @GetMapping
    public ModelAndView calculatorGet(ModelAndView model) {
        model.setViewName("calculator");
        model.addObject("operation", new Operation());
        return model;
    }

    @PostMapping
    public ModelAndView calculatorPost(@ModelAttribute("operation") Operation operation, HttpSession session, ModelAndView model) {
        List<String> history = (List<String>) session.getAttribute("history");
        model.setViewName("calculator");
        model.addObject("result", service.calculate(operation, history));
        return model;
    }
}
