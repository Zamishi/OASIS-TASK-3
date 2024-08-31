package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Reservation;
import com.example.demo.repository.ReservationRepository;

@Service
public class ReservationService {
@Autowired
private ReservationRepository reservationRepository;

public void save(Reservation reservation) {
	reservationRepository.save(reservation);
}

public Reservation findbyId(Long id) {
	return reservationRepository.findById(id).orElse(null);
}

}
