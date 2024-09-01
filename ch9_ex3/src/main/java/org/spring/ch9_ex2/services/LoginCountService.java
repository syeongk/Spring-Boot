package org.spring.ch9_ex2.services;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.ApplicationScope;
import org.springframework.web.context.annotation.SessionScope;

@Service
@ApplicationScope
public class LoginCountService {

    private int count;

    public void increment(){
        count++;
    }
    public int getCount() {
        return count;
    }
}
