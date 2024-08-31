package com.example.demo.controller;


import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.Cancellation;
import com.example.demo.entity.Reservation;
import com.example.demo.service.CancellationService;
import com.example.demo.service.ReservationService;

@Controller
public class CancellationController {
@Autowired
private CancellationService cancellationService;
@Autowired
private ReservationService reservationService;

@GetMapping("/cancellation")
public String cancellationForm(Model model){
	model.addAttribute("cancellation",new Cancellation());
	return "cancellation";
}
@PostMapping("/cancellation")
public String cancelReservation(@RequestParam Long reservationId,Model model) {
	Cancellation cancellation = new Cancellation();
	Reservation reservation = reservationService.findbyId(reservationId);
		if(reservation != null) {
			cancellation.setReservation(reservation);
			cancellation.setCancellationDate(new Date());
			cancellationService.save(cancellation);
			model.addAttribute("message","Cancellation Successful!");
		}
		else {
			model.addAttribute("error","Invalid PNR Number");
		}
		return "cancellation";
	}
}

