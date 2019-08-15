//package com.jd2.TRDacademy.web.controller.user;
//
//import com.jd2.TRDacademy.entities.Car;
//import com.jd2.TRDacademy.entities.Client;
//import com.jd2.TRDacademy.entities.Request;
//import com.jd2.TRDacademy.entities.Track;
//import com.jd2.TRDacademy.services.CarService;
//import com.jd2.TRDacademy.services.ClientService;
//import com.jd2.TRDacademy.services.RequestService;
//import com.jd2.TRDacademy.services.TrackService;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@Controller
//public class UserRequestController extends HttpServlet {
//
//    @Autowired
//    CarService carService;
//    @Autowired
//    RequestService requestService;
//    @Autowired
//    TrackService trackService;
//    @Autowired
//    ClientService clientService;
//
//    @RequestMapping(value = "accounts/user/myrequests", method = RequestMethod.GET)
//    public String doGet(Model model, HttpServletRequest req, HttpServletResponse resp) {
//
//        HttpSession session = req.getSession();
//        String email = session.getAttribute("myEmail").toString();
//
//        Long client_id = 0l;
//
//        List<Request> requestList = new ArrayList<>();
//
//        for (Client client : clientService.getAll()) {
//            if (client.getEmail().equals(email)) {
//                client_id = client.getClientId();
//            }
//        }
//
//        for (Request request : requestService.getAll()) {
//            if (request.getClientId() == client_id) {
//                requestList.add(request);
//            }
//        }
//        req.setAttribute("requests", requestList);
//
//        List<Car> carList = carService.getAll();
//        req.setAttribute("cars", carList);
//
//        List<Track> trackList = trackService.getAll();
//        req.setAttribute("tracks", trackList);
//    return "accounts/user/myrequests";
//    }
//}