package org.spring.ch9_ex2.controllers;

import org.spring.ch9_ex2.LoginProcess;
import org.spring.ch9_ex2.services.LoggedUserManagementService;
import org.spring.ch9_ex2.services.LoginCountService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    private final LoggedUserManagementService loggedUserManagementService;
    private final LoginCountService loginCountService;

    public MainController(LoggedUserManagementService loggedUserManagementService, LoginCountService loginCountService) {
        this.loggedUserManagementService = loggedUserManagementService;
        this.loginCountService = loginCountService;
    }

    @GetMapping("/main")
    public String main(
            Model model,
            @RequestParam(required = false) String logout) {

        if (logout != null) {
            loggedUserManagementService.setId(null);
        }

        String id = loggedUserManagementService.getId();
        int count = loginCountService.getCount();

        if (id == null) {
            return "redirect:/";
        }

        model.addAttribute("id", id);
        model.addAttribute("count", count);
        return "main.html";
    }
}
