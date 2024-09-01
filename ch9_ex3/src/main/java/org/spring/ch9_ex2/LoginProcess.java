package org.spring.ch9_ex2;

import org.spring.ch9_ex2.controllers.LoginController;
import org.spring.ch9_ex2.services.LoggedUserManagementService;
import org.spring.ch9_ex2.services.LoginCountService;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

@Component
@RequestScope
public class LoginProcess {

    private final LoginController loginController;
    private final LoggedUserManagementService loggedUserManagementService;
    private final LoginCountService loginCountService;

    private String id;
    private String pw;

    public LoginProcess(LoginController loginController, LoggedUserManagementService loggedUserManagementService,
                        LoginCountService loginCountService) {
        this.loginController = loginController;
        this.loggedUserManagementService = loggedUserManagementService;
        this.loginCountService = loginCountService;
    }

    public boolean login(){
        loginCountService.increment();

        String id = this.id;
        String pw = this.pw;

        boolean loginResult = false;
        if ("admin".equals(id) && "1234".equals(pw)) {
            loginResult = true;
            loggedUserManagementService.setId(id);
        }
        return loginResult;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }



}
