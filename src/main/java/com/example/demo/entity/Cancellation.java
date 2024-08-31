package com.example.demo.entity;



import java.util.Date;

import jakarta.persistence.*;

@Entity
public class Cancellation {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date cancellationDate;

    @OneToOne
    @JoinColumn(name = "reservation_id")
    private Reservation reservation;

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCancellationDate() {
        return cancellationDate;
    }

    public void setCancellationDate(java.util.Date date) {
        this.cancellationDate = date;
    }

    public Reservation getReservation() {
        return reservation;
    }

    public void setReservation(Reservation reservation) {
        this.reservation = reservation;
    }

}
