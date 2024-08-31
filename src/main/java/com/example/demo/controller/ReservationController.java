package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.Reservation;
import com.example.demo.service.ReservationService;

@Controller
public class ReservationController {
	@Autowired
	private ReservationService reservationService;
	
	@GetMapping("/reservation")
	public String reservationForm(Model model) {
		model.addAttribute("reservation",new Reservation());
		return "reservation";
	}
	
	@PostMapping("/reservation")
	public String saveReservation(@ModelAttribute Reservation reservation,Model model) {
		reservationService.save(reservation);
		model.addAttribute("message","Reservation Successful!");
		return "reservation";
	}

}
