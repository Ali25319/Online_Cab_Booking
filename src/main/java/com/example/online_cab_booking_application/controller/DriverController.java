package com.example.online_cab_booking_application.controller;


import com.example.online_cab_booking_application.DTO.LoginDTO;
import com.example.online_cab_booking_application.Model.Driver;
import com.example.online_cab_booking_application.Model.DriverSession;
import com.example.online_cab_booking_application.services.DriverServices;
import com.example.online_cab_booking_application.services.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/driver")
public class DriverController {


    @Autowired
    DriverServices driverServices;


    @Autowired
    private LoginService loginService;


    @PostMapping("/login")
    public ResponseEntity<DriverSession> loginDriver(@RequestBody LoginDTO dto) {
        return new ResponseEntity<>(loginService.loginDriver(dto), HttpStatus.ACCEPTED);
    }


    @PostMapping(value = "/register")
    public Driver registerDriver(@RequestBody Driver driver) {

        Driver registeredDriver =driverServices.newDriver(driver);
        return registeredDriver;
    }
    @GetMapping(value = "/driverlist")
    public List<Driver> getAllDrivers(@RequestParam String key){

        List<Driver> driverlist=driverServices.getAllDriver(key);
        return driverlist;
    }

    @DeleteMapping(value = "/delete/{username}")
    public  String deleteDriverByUsername(@PathVariable("username") String name,@RequestParam String key) {

        String str=driverServices.removeDriver(name,key);

        return str;
    }

    @PutMapping(value = "/update")
    public Driver updateDriver(@RequestBody Driver driver,@RequestParam String key) {

        Driver updateddriver=driverServices.updateDriver(driver,key);
        return updateddriver;
    }

    @PatchMapping("/status/{?}")
    public String updateStatus(@RequestParam String key, @PathVariable("?") String newStatus) {
        return driverServices.updateStatus(newStatus, key);

    }

    @GetMapping("/logout")
    public String logoutDriver(@RequestParam String key) {

        return driverServices.logoutDriver(key);

    }

    @GetMapping(value ="/bestdriver")
    public List<Driver> getBestDriver(@RequestParam String key,@RequestParam  float rating){

        return driverServices.viewBestDriver(key,rating);
    }
}
