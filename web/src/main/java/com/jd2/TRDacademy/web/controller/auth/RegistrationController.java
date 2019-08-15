//package com.jd2.TRDacademy.web.controller.auth;
//
//import com.jd2.TRDacademy.entities.User;
//import com.jd2.TRDacademy.services.UserService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//@Controller
//public class RegistrationController extends HttpServlet {
//
//    @Autowired
//    UserService userService;
//
//    @RequestMapping(value = "registration", method = RequestMethod.GET)
//    public String doGet(Model model) {
//        return "registration";
//    }
//
//    @RequestMapping(value = "registration", method = RequestMethod.POST)
//    public String doPost(Model model, HttpServletRequest req, HttpServletResponse resp) {
//
//        User user = new User();
//        String role = "user";
//        String username = req.getParameter("username");
//        String user_email = req.getParameter("user_email");
//        String user_password = req.getParameter("user_password");
//        String message = null;
//
//        if (userService.getEmails().contains(user_email) &&
//                userService.getUsernames().contains(username)) {
//            message = "This username and email are already taken";
//
//        } else if (userService.getEmails().contains(user_email)) {
//            message = "This email is already taken";
//
//        } else if (userService.getUsernames().contains(username)) {
//            message = "This username is already taken";
//        } else {
//            user.setUsername(username);
//            user.setUserEmail(user_email);
//            user.setUserPassword(user_password);
//            user.setRole(role);
//            userService.add(user);
//            message = "Succesfull reqistration";
//        }
//        req.setAttribute("message", message);
//        return "registration";
//    }
//
//
//}
//
