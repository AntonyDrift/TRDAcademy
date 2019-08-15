package com.jd2.TRDacademy.web.controller.auth;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class LogoutController {

    @RequestMapping(value = "logout", method = {RequestMethod.GET, RequestMethod.POST})
    public String doGet(Model model, HttpServletRequest req) {
        req.getSession().invalidate();
        return "redirect:/main";
    }
}
