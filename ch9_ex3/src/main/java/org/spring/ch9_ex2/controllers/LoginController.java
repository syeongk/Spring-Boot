package org.spring.ch9_ex2.controllers;

import org.spring.ch9_ex2.LoginProcess;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    private final LoginProcess loginProcess;

    public LoginController(LoginProcess loginProcess) {
        this.loginProcess = loginProcess;
    }

    @GetMapping("/")
    public String loginGet() {
        return "login.html";
    }

    @PostMapping("/")
    public String loginPost(
            Model model,
            @RequestParam String id,
            @RequestParam String pw) {

        loginProcess.setId(id);
        loginProcess.setPw(pw);

        boolean loggedIn = loginProcess.login();

        if (loggedIn) {
            return "redirect:/main";
        }

        model.addAttribute("message", "Login Failed!");
        return "login.html";

    }
}
