//package com.jd2.TRDacademy.web.controller.auth;
//
//import com.jd2.TRDacademy.entities.User;
//import com.jd2.TRDacademy.services.UserService;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpSession;
//
//import java.util.List;
//
//@Controller
//public class LoginController {
//
//    @Autowired
//    private UserService userService;
//    private static User user = new User();
//    private String message = null;
//
//    @RequestMapping(value = "login", method = RequestMethod.GET)
//    public String doGet(Model model) {
//        return "login";
//    }
//
//    @RequestMapping(value ="login", method = RequestMethod.POST)
//        public String doPost (Model model, HttpServletRequest req) {
//
//            String username = req.getParameter("username");
//            String password = req.getParameter("user_password");
//
//            List<User> userList = userService.getAll();
//            req.setAttribute("users", userList);
//
//            for (User user : userList) {
//
//                if (userService.getUsernames().contains(username)) {
//                    if (password.equals(user.getUserPassword())) {
//
//                        HttpSession session = req.getSession();
//                        session.setAttribute("username", user.getUsername());
//                        session.setAttribute("password", user.getUserPassword());
//                        session.setAttribute("myEmail", user.getUserEmail());
//                        session.setAttribute("role", user.getRole());
//
//                        if (user.getRole().equals("admin")) {
//                            message = "admin";
//                            req.setAttribute("message",message);
//                            return "redirect:/accounts/admin";
//
//                        } else if (user.getRole().equals("user")) {
//
//                            message = "user";
//                            req.setAttribute("message",message);
//                            return "redirect:/accounts/user";
//                        }
//                    }
//                }
//            } message = "try again";
//            req.setAttribute("message",message);
//            return "login";
//        }
//    }
