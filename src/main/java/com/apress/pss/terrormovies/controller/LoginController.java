package com.apress.pss.terrormovies.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by john on 14-7-24.
 */

@Controller
@RequestMapping("")
public class LoginController {
    @RequestMapping(method = RequestMethod.GET, value = "/custom_login")
    public String showLogin() {
        return "login";
    }
}
