package com.jd2.TRDacademy.web.controller;

import com.jd2.TRDacademy.entities.Car;
import com.jd2.TRDacademy.entities.Client;
import com.jd2.TRDacademy.entities.Request;
import com.jd2.TRDacademy.entities.Track;
import com.jd2.TRDacademy.services.CarService;
import com.jd2.TRDacademy.services.ClientService;
import com.jd2.TRDacademy.services.RequestService;
import com.jd2.TRDacademy.services.TrackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

import java.io.UnsupportedEncodingException;
import java.sql.Timestamp;;
import java.util.List;

@Controller
public class AddRequestController {
    @Autowired
    CarService carService;
    @Autowired
    TrackService trackService;
    @Autowired
    ClientService clientService;
    @Autowired
    RequestService requestService;



    @RequestMapping(value = "addrequest", method = RequestMethod.GET)
    public String doGet(Model model,  HttpServletRequest request) {

        String getType = request.getParameter("classCar");
        List<Car> getCars = carService.getCarsByClass(getType);
        List<Track> getTracks=trackService.getByType(getType);
        model.addAttribute("tracks", getTracks).addAttribute("cars", getCars);
        return "addrequest";
    }

    @RequestMapping(value = "addrequest", method = RequestMethod.POST)
    public String doPost(Model model,  HttpServletRequest req) throws UnsupportedEncodingException {

        req.setCharacterEncoding("UTF-8");
//        resp.setContentType("text/html");


        Client client = new Client();
        Request request = new Request();

        String message = "x";

        String surname = req.getParameter("surname");
        String client_email = req.getParameter("client_email");
        int phone_number = Integer.parseInt(req.getParameter("phoneNumber"));
        String car_id = req.getParameter("carId");
        String track_id = req.getParameter("track_id");
        Timestamp request_date = new Timestamp(System.currentTimeMillis());


        if (car_id == null | track_id == null) {
            message = "Select car or track!";
            req.setAttribute("message", message);
            return "addrequest";

        } else {
            client.setClientId(null);
            client.setSurname(surname);
            client.setEmail(client_email);
            client.setPhoneNumber(phone_number);

            if (!clientService.getClientsEmail().contains(client_email)) {
                clientService.add(client);
            }
            for (Client clients : clientService.getAll()) {
                if (clients.getEmail().equals(client_email)) {
                    request.setClientId(clients.getClientId());
                }
            }

            request.setRequestDate(request_date.toString());
            request.setCarId(Long.parseLong(car_id));
            request.setTrackId(Long.parseLong(track_id));
            request.setRequestStatus(0);
            request.setCost(100);
            requestService.add(request);

            message = "Thanks for request!";
            req.setAttribute("message", message);

//            req.getRequestDispatcher("/index.jsp").forward(req, resp);
            return "addrequest";
        }
    }
    }
//}
//
//
//
//
//
