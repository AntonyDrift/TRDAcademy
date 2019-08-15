//package com.jd2.TRDacademy.web.controller.admin;
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
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//import java.sql.Timestamp;
//import java.util.List;
//
//@Controller
//public class AdminRequestController {
//
//    @Autowired
//    private CarService carService;
//    @Autowired
//    private RequestService requestService;
//    @Autowired
//    private TrackService trackService;
//    @Autowired
//    private ClientService clientService;
//
//    private static Client client = new Client();
//    private static Request request = new Request();
//
//    @RequestMapping(value = "accounts/admin/editrequests", method = RequestMethod.GET)
//    public String doGet(Model model, HttpServletRequest req, HttpServletResponse resp) {
//
//        List<Request> requestList = requestService.getAll();
//        req.setAttribute("requests", requestList);
//
//        List<Client> clientList = clientService.getAll();
//        req.setAttribute("clients", clientList);
//
//        List<Car> carList = carService.getAll();
//        req.setAttribute("cars", carList);
//
//        List<Track> trackList = trackService.getAll();
//        req.setAttribute("tracks", trackList);
//
//        return "accounts/admin/editrequests";
//    }
//
//    @RequestMapping(value = "accounts/admin/editrequests", method = RequestMethod.POST)
//    public String doPost(HttpServletRequest req) {
//
//        String message = null;
//
//        String delete_request = req.getParameter("delete");
//        String update_request = req.getParameter("update");
//        String add_request = req.getParameter("add");
//
//        String request_date = null;
//        String client_id = req.getParameter("clientId");
//        String car_id = req.getParameter("carId");
//        String track_id = req.getParameter("track_id");
//        String request_status = req.getParameter("request_status");
//        String cost = req.getParameter("cost");
////DELETE
//        if (delete_request != null) {
//            if (req.getParameter("request_id") == null) {
//                message = "Choose request on table";
//
//            } else {
//
//                requestService.delete(Long.parseLong(req.getParameter("request_id")));
//                message = "Request successfully deleted";
//            }
////UPDATE
//        } else if (client_id == "" | car_id == "" | track_id == "" |
//                request_status == "" | cost == "") {
//            message = "Enter fields, please";
//
//        } else {
//            request_date = new Timestamp(System.currentTimeMillis()).toString();
//            request.setRequestDate(request_date);
//            request.setClientId(Long.parseLong(client_id));
//            request.setCarId(Long.parseLong(car_id));
//            request.setTrackId(Long.parseLong(track_id));
//            request.setRequestStatus(Integer.parseInt(request_status));
//            request.setCost(Integer.parseInt(cost));
//
//            if (update_request != null) {
//
//                if (req.getParameter("request_id") == null) {
//                    message = "Choose request on table";
//
//                } else {
//                    request.setRequestId(Long.parseLong(req.getParameter("request_id")));
//                    requestService.update(request);
//                    message = "Request successfully updated";
//                }
//                //ADD
//            } else if (add_request != null) {
//                requestService.add(request);
//                message = "Request successfully added";
//            }
//        }
//        List<Request> requestList = requestService.getAll();
//        req.setAttribute("requests", requestList);
//
//        List<Client> clientList = clientService.getAll();
//        req.setAttribute("clients", clientList);
//
//        List<Car> carList = carService.getAll();
//        req.setAttribute("cars", carList);
//
//        List<Track> trackList = trackService.getAll();
//        req.setAttribute("tracks", trackList);
//
//        req.setAttribute("message", message);
//        return "accounts/admin/editrequests";
//    }
//}
