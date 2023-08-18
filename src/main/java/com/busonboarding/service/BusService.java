//package com.busonboarding.service;
//
//import java.util.List;
//import java.util.Optional;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.busonboarding.domain.Bus;
//import com.busonboarding.repo.BusRepository;
//
//@Service
//public class BusService {
//	
//	@Autowired
//	BusRepository db;
//	
//	public int addBus(Bus busToBeAdded){
//		
//		Bus b = db.save(busToBeAdded);
//		return b.getId();
//		
//	}
//	
//	public List<Bus> getAllBus(){
//		
//		List<Bus> l = (List<Bus>) db.findAll();
//		return l;
//		
//	}
//	
//	public Optional<Bus> getBus(int id){
//		
//		Optional<Bus> l = db.findById(id);
//		return l;
//		
//	}
//
//
//}
