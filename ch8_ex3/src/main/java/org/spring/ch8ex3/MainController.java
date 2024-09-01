package org.spring.ch8ex3;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    @GetMapping("/home/{color}/{name}")
    public String home(
            Model model,
            @PathVariable String color,
            @PathVariable String name) {
        model.addAttribute("name", name);
        model.addAttribute("color", color);
        return "home.html";
    }
}
