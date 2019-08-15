//package com.jd2.TRDacademy.web.controller.admin;
//
//import com.jd2.TRDacademy.entities.Client;
//import com.jd2.TRDacademy.services.ClientService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//
//import javax.servlet.http.HttpServletRequest;
//
//import java.util.List;
//
//@Controller
//public class AdminClientController {
//
//    @Autowired
//    private ClientService clientService;
//    private static Client client = new Client();
//
//
//    @RequestMapping(value = "accounts/admin/editclients", method = RequestMethod.GET)
//    public String doGet(Model model, HttpServletRequest req) {
//
//        List<Client> clientList = clientService.getAll();
//        req.setAttribute("clients", clientList);
//        return "accounts/admin/editclients";
//    }
//
//    @RequestMapping(value = "accounts/admin/editclients", method = RequestMethod.POST)
//    public String doPost(Model model, HttpServletRequest req) {
//
//        String message = null;
//
//        String delete_client = req.getParameter("delete");
//        String update_client = req.getParameter("update");
//        String add_client = req.getParameter("add");
//
//        String surname = req.getParameter("surname");
//        String email = req.getParameter("email");
//        String phone_number = req.getParameter("phoneNumber");
////delete method
//        if (delete_client != null) {
//            if (req.getParameter("clientId") == null) {
//                message = "Choose client on table";
//
//            } else {
//                clientService.delete(Long.parseLong(req.getParameter("clientId")));
//                message = "Client successfully deleted";
//            }
////update method
//        } else if (surname == "" | email == "" | phone_number == "") {
//            message = "Enter fields, please";
//
//        } else {
//            client.setSurname(surname);
//            client.setEmail(email);
//            client.setPhoneNumber(Integer.parseInt(phone_number));
//
//            if (update_client != null) {
//
//                if (req.getParameter("clientId") == null) {
//                    message = "Choose client on table";
//
//                } else {
//                    client.setClientId(Long.parseLong(req.getParameter("clientId")));
//                    clientService.update(client);
//                    message = "Client successfully updated";
//                }
//            } else if (add_client != null) {
//
//                clientService.add(client);
//
//                    message = "Client successfully added";
//            }
//        }
//
//        List<Client> clientList = clientService.getAll();
//        req.setAttribute("clients", clientList);
//        return "accounts/admin/editclients";
//    }
//}