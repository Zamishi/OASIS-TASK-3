package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Cancellation;
import com.example.demo.repository.CancellationRepository;

@Service
public class CancellationService {
@Autowired
private CancellationRepository cancellationRepository;

public void save(Cancellation cancellation) {
	cancellationRepository.save(cancellation);
}

public Cancellation findbyReservationId(Long reservationId) {
	return cancellationRepository.findById(reservationId).orElse(null);
}
}
