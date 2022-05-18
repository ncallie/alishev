package ru.ncallie.conrollers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
public class CalculatorController {
    @GetMapping("/calculator")
    public String calculatorPage(HttpServletRequest request, Model model){
        Integer a;
        Integer b;
        String action;
        String hint = "Result = ";
        try {
            a = Integer.parseInt(request.getParameter("a"));
            b = Integer.parseInt(request.getParameter("b"));
            action = request.getParameter("action");
            if (action == null)
                throw new NullPointerException();
            model.addAttribute("result", hint + calculate(a, b, action));
        } catch (NumberFormatException e) {
            model.addAttribute("result", hint + "?");
            return "/calculator/calculator";
        }
        return "/calculator/calculator";
    }
    private Integer calculate(Integer a, Integer b, String action) {
        switch (action) {
            case "multiplication":
                return a * b;
            case "addition":
                return a + b;
            case "subtraction":
                return a - b;
            case "division":
                return a / b;
            default:
                throw new NumberFormatException();
        }
    }
}
