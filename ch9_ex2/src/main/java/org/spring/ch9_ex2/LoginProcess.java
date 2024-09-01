package org.spring.ch9_ex2.model;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

@Component
@RequestScope
public class LoginProcess {

    private String id;
    private String pw;


    public boolean login(){
        String id = this.id;
        String pw = this.pw;

        if ("admin".equals(id) && "1234".equals(pw)) {
            return true;
        } else{
            return false;
        }
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
