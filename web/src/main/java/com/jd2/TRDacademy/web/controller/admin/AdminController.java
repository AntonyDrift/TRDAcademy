package com.jd2.TRDacademy.web.controller.admin;

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
//
//@WebServlet(urlPatterns = "/accounts/admin")
@Controller
public class AdminController {

    @RequestMapping(value = "accounts/admin", method = {RequestMethod.GET, RequestMethod.POST})
    public String doGet(Model model, HttpServletRequest req, HttpServletResponse resp) {
//        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html");
//        req.getRequestDispatcher("/WEB-INF/accounts/admin/admin.jsp").forward(req, resp);
        return "accounts/admin";
    }
}


