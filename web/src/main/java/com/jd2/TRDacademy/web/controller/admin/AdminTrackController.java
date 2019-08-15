//package com.jd2.TRDacademy.web.controller.admin;
//
//import com.jd2.TRDacademy.entities.Track;
//import com.jd2.TRDacademy.services.TrackService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServletRequest;
//import java.util.List;
//
//
//@WebServlet(urlPatterns = {"/accounts/admin/edittracks"}, name = "adminTracks")
//public class AdminTrackController {
//
//    @Autowired
//    private TrackService trackService;
//    private static Track track = new Track();
//
//    @RequestMapping(value = "accounts/admin/edittracks", method = RequestMethod.GET)
//    public String doGet(Model model, HttpServletRequest req) {
//
//        List<Track> trackList = trackService.getAll();
//        req.setAttribute("tracks", trackList);
//        return "accounts/admin/edittracks";
//    }
//
//    @RequestMapping(value = "accounts/admin/edittracks", method = RequestMethod.POST)
//    public String doPost(HttpServletRequest req) {
//
//        String message = null;
//
//        String delete_track = req.getParameter("delete");
//        String update_track = req.getParameter("update");
//        String add_track = req.getParameter("add");
//
//        String track_name = req.getParameter("track_name");
//        String track_length = req.getParameter("track_length");
//        String track_type = req.getParameter("track_type");
//
//        //DELETE
//        if (delete_track != null) {
//            if (req.getParameter("track_id") == null) {
//                message = "Choose track on table";
//
//            } else {
//
//                trackService.delete(Long.parseLong(req.getParameter("track_id")));
//                    message = "Track successfully deleted";
//                }
//                //UPDATE
//        } else if (track_name == "" | track_length == "" | track_type == "") {
//            message = "Enter fields, please";
//
//        } else {
//            track.setTrackName(track_name);
//            track.setTrackLength(Integer.parseInt(track_length));
//            track.setTrackType(track_type);
//
//            if (update_track != null) {
//
//                if (req.getParameter("track_id") == null) {
//                    message = "Choose track on table";
//
//                } else {
//                    track.setTrackId(Long.parseLong(req.getParameter("track_id")));
//                    trackService.update(track);
//                        message = "Track successfully updated";
//                    }
//                //ADD
//            } else if (add_track != null) {
//                trackService.add(track);
//                    message = "Track successfully added";
//            }
//        }
//
//        List<Track> trackList = trackService.getAll();
//        req.setAttribute("tracks", trackList);
//
//        req.setAttribute("message", message);
//        return "accounts/admin/edittracks";
//    }
//}