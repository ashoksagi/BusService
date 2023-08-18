package com.busonboarding.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Bus {
//
	
	
//	int id -- auto gen PK
//	String busmodel
//	int capacity
//	int UserId --- User table key 
//  String startingPoint
//	String endPoint
//  int reviewRating
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBusmodel() {
		return busmodel;
	}
	public void setBusmodel(String busmodel) {
		this.busmodel = busmodel;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getStartingPoint() {
		return startingPoint;
	}
	public void setStartingPoint(String startingPoint) {
		this.startingPoint = startingPoint;
	}
	public String getEndPoint() {
		return endPoint;
	}
	public void setEndPoint(String endPoint) {
		this.endPoint = endPoint;
	}
	public Boolean getReviwed() {
		return reviwed;
	}
	public void setReviwed(Boolean reviwed) {
		this.reviwed = reviwed;
	}
	String busmodel;
	int capacity;
	int userId; 
	String startingPoint;
	String endPoint;
	Boolean reviwed;

	


}
