package by.springwebcalc.controller;

import by.springwebcalc.service.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
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
        return model;
    }

    @PostMapping
    public ModelAndView calculatorPost(String firstElement, String secondElement, String operation,
                                       HttpServletRequest req, ModelAndView model) {
        List<String> history = (List<String>) req.getSession().getAttribute("history");
        model.setViewName("calculator");
        model.addObject("result", service.calculate(firstElement, secondElement, operation, history));
        return model;
    }
}
