//package com.jd2.TRDacademy.web.controller.admin;
//
//import com.jd2.TRDacademy.entities.Car;
//import com.jd2.TRDacademy.services.CarService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//
//import javax.servlet.http.HttpServletRequest;
//import java.util.List;
//
//@Controller
//public class AdminCarController {
//
//    @Autowired
//    private CarService carService;
//    private static Car car = new Car();
//
//
//    @RequestMapping(value = "accounts/admin/editcars", method = RequestMethod.GET)
//    public String doGet(HttpServletRequest req) {
//
//        List<Car> carList = carService.getAll();
//        req.setAttribute("cars", carList);
//        return "accounts/admin/editcars";
//    }
//
//    @RequestMapping(value = "accounts/admin/editcars", method = RequestMethod.POST)
//    public String doPost(HttpServletRequest req) {
//
//        String message = null;
//
//        String deleteCar = req.getParameter("delete");
//        String updateCar = req.getParameter("update");
//        String addCar = req.getParameter("add");
//
//        String model = req.getParameter("model");
//        String wheeldrive = req.getParameter("wheelDrive");
//        String power = req.getParameter("power");
//        String available = req.getParameter("available");
//        String classCar = req.getParameter("classCar");
////delete method
//        if (deleteCar != null) {
//            if (req.getParameter("carId") == null) {
//                message = "Choose car on table";
//
//            } else {
//                carService.delete(Long.parseLong(req.getParameter("carId")));
//                message = "Car successfully deleted";
//            }
////update method
//        } else if ("".equals(model) || wheeldrive == "" || power == ""
//                || available == "" || classCar == "") {
//            message = "Enter fields, please";
//
//        } else {
//            car.setModel(model);
//            car.setWheelDrive(wheeldrive);
//            car.setPower(Integer.parseInt(power));
//            car.setAvailable(Integer.parseInt(available));
//            car.setClassCar(classCar);
//
//            if (updateCar != null) {
//
//                if (req.getParameter("carId") == null) {
//                    message = "Choose car on table";
//
//                } else {
//                    car.setCarId(Long.parseLong(req.getParameter("carId")));
//                    carService.update(car);
//                    message = "Car successfully updated";
//                }
////add method
//            } else if (addCar != null) {
//                carService.add(car);
//                message = "Car successfully added";
//            }
//        }
//
//        List<Car> carList = carService.getAll();
//        req.setAttribute("cars", carList);
//        req.setAttribute("message", message);
//        return "accounts/admin/editcars";
//    }
//}