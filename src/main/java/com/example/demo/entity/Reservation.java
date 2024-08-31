package com.example.demo.entity;

import java.sql.Date;

import jakarta.persistence.*;

@Entity
public class Reservation {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Long id;
	private String trainNumber;
	private String trainName;
	private String classType;
	private Date journeyDate;
	private String boardingStation;
	private String destinationStation;
	
	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getTrainNumber() {
		return trainNumber;
	}
	
	public void setTrainNumber(String trainNumber) {
		this.trainNumber = trainNumber;
	}
	
	public String getTrainName() {
		return trainName;
	}
	
	public void setTrainName(String trainName) {
		this.trainName = trainName;
	}
	
	public String getClassType() {
		return classType;
	}
	
	public void setClassType(String classType) {
		this.classType = classType;
	}
	
	public Date getJourneyDate() {
		return journeyDate;
	}
	
	public void setJourneyDate(Date journeyDate) {
		this.journeyDate = journeyDate;
	}
	
	public String setBoardingStation() {
		return boardingStation;
	}
	
	public void getBoardingStation(String boardingStation) {
		this.boardingStation = boardingStation;
	}
	
	public String setDestinationStation() {
		return destinationStation;
	}
	
	public void getDestinationStation(String destinationStation) {
		this.destinationStation = destinationStation;
	}

}
