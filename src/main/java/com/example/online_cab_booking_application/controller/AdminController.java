package com.example.online_cab_booking_application.controller;

import com.example.online_cab_booking_application.DTO.AdminDTO;
import com.example.online_cab_booking_application.DTO.LoginDTO;
import com.example.online_cab_booking_application.Model.*;
import com.example.online_cab_booking_application.services.AdminService;
import com.example.online_cab_booking_application.services.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.security.auth.login.LoginException;
import java.util.List;

@RestController
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    private LoginService loginService;

    @Autowired
    AdminService adminService;

    @PostMapping("/login")
    public ResponseEntity<AdminSession> loginAdmin(@RequestBody LoginDTO dto) {
        return new ResponseEntity<>(loginService.loginAdmin(dto), HttpStatus.ACCEPTED);
    }

    @PostMapping("/register")
    public Admin registerAdmin(@RequestBody Admin admin) {
        return adminService.adminRegister(admin);

    }

    @PatchMapping("/update/{username}")
    public Admin updateAdminPassword(@RequestBody AdminDTO dto, @PathVariable("username") String username,
                                     @RequestParam String key) {
        return adminService.updatePassword(dto, username, key);
    }

    @PutMapping("/update/{username}")
    public Admin updateAdmin(@RequestBody Admin admin, @PathVariable("username") String username,
                             @RequestParam String key) {
        return adminService.update(admin, username, key);
    }

    @DeleteMapping("/delete")
    public String deleteAdmin(@RequestBody AdminDTO dto, @RequestParam String key) {
        return adminService.deleteByUsername(dto, key);

    }

    @GetMapping("/logout")
    public String logoutAdmin(@RequestParam String key) throws LoginException {

        return adminService.logoutAdmin(key);

    }

    @GetMapping("/listoftripsbycustomer")
    public List<CompletedTrips> listOfAllTripsByCustomer(@RequestParam Integer customerId, @RequestParam String key) {
        return adminService.getTripsByCustomerId(customerId, key);

    }

    @GetMapping("/listoftrips")
    public List<CompletedTrips> listOfAllTrips(@RequestParam String key) {
        return adminService.getAllTrips(key);
    }

    @GetMapping("/listofcustomers")
    public List<Customer> listOfCustomers(@RequestParam String key) {

        List<Customer> listOfCustomers = adminService.getListOfCustomers(key);

        return listOfCustomers;
    }

    @GetMapping("/listofdrivers")
    public List<Driver> listOfDrivers(@RequestParam String key) {

        List<Driver> listOfDrivers = adminService.getListOfDrivers(key);

        return listOfDrivers;
    }
}
