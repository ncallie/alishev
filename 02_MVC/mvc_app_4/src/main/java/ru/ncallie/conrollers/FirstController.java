package ru.ncallie.conrollers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/first")
public class FirstController {
    @GetMapping("/hello")
    public String helloPage(HttpServletRequest request, Model model) {
        String name = request.getParameter("name");
        String surname = request.getParameter("surname");
        if (name == null || surname == null)
            return "first/hello";
        model.addAttribute("message", name + " " + surname);
        return "first/hello";
    }
    @GetMapping("/goodbye")
    public String goodByePage(@RequestParam(value = "name", required = false)String name,
                              @RequestParam(value = "surname", required = false) String surname, Model model) {
        if (name == null || surname == null)
            return "first/goodbye";
        model.addAttribute("message", name + " " + surname);
        return "first/goodbye";
    }
}
