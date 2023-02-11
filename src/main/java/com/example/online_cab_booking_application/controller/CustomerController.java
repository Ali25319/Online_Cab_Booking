package com.example.online_cab_booking_application.controller;

import com.example.online_cab_booking_application.DTO.CustomerDTO;
import com.example.online_cab_booking_application.DTO.LoginDTO;
import com.example.online_cab_booking_application.Model.*;
import com.example.online_cab_booking_application.execption.CustomerException;
import com.example.online_cab_booking_application.services.CustomerService;
import com.example.online_cab_booking_application.services.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @Autowired
    private LoginService loginService;

    @PostMapping("/login")
    public ResponseEntity<UserSession> loginCustomer(@RequestBody LoginDTO customerdto) {
        return new ResponseEntity<>(loginService.loginCustomer(customerdto), HttpStatus.ACCEPTED);
    }

    @PostMapping("/register")
    public Customer registerCustomer(@RequestBody Customer user) {
        Customer newUser = customerService.register(user);
        return newUser;

    }

    @GetMapping("/customerlist")
    public List<Customer> getAllCustomer() {
        List<Customer> list = customerService.getCustomer();
        if (list.isEmpty())
            throw new CustomerException("There is no customer found in the database.");
        return list;
    }

    @PatchMapping("/updatepassword/{mobile}")
    public Customer updateCustomerPasswordByMobile(@RequestBody CustomerDTO dto, @PathVariable("mobile") String mobile,
                                                   @RequestParam String key) {
        return customerService.updatePassword(dto, mobile, key);
    }

    @DeleteMapping("/delete")
    public String deleteCustomer(@RequestBody CustomerDTO dto, @RequestParam String key) {
        return customerService.deleteCustomer(dto, key);

    }

    @PutMapping("/update/{mobile}")
    public Customer updateCustomerByMobile(@RequestBody Customer customer, @PathVariable("mobile") String mobile,
                                           @RequestParam String key) {
        return customerService.updateCustomer(customer, mobile, key);
    }

    @GetMapping("/availablecabs")
    public List<Driver> availableCabs() {

        return customerService.getAvailableDrivers();

    }

    @GetMapping("/allcabs")
    public List<Driver> getListForAllCabs() {
        return customerService.generalListOfDrivers();
    }

    @PostMapping("/booktrip")
    public ResponseEntity<TripBooking> bookTrip(@RequestBody TripBooking trip, @RequestParam String key) {

        TripBooking bookedTrip = customerService.bookTrip(trip, key);

        ResponseEntity<TripBooking> confirmed = new ResponseEntity<TripBooking>(bookedTrip, HttpStatus.CREATED);

        return confirmed;
    }

    @GetMapping("/logout")
    public String logoutCustomer(@RequestParam String key) {

        return customerService.logoutCustomer(key);
    }

    @DeleteMapping("/complete/{tripid}")
    public String completeTrip(@RequestParam String key, @PathVariable("tripid") Integer tripId) {
        return customerService.completeTrip(key, tripId);
    }

    @DeleteMapping("/canceltrip")
    public String cancelTrip(@RequestParam String key, @RequestParam Integer tripId) {
        return customerService.cancelTrip(key, tripId);
    }

    @GetMapping("/checkhistory")
    public List<CompletedTrips> getYourTripHistory(@RequestParam String key) {
        return customerService.alltripHistory(key);
    }

    @PostMapping("/updatetrip")
    public ResponseEntity<TripBooking> updateTrip(@RequestBody TripBooking trip, @RequestParam String key ){

        TripBooking updatedTrip =  customerService.updateTrip(trip,key);
        return new ResponseEntity<>(updatedTrip, HttpStatus.OK);

    }
}
