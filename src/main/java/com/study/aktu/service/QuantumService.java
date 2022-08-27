//package com.study.aktu.service;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.study.aktu.model.Quantum;
//import com.study.aktu.repo.QuantumRepository;
//
//@Service
//public class QuantumService {
//	@Autowired
//	 private QuantumRepository repo;
//     
//	    public List<Quantum> listAll(String keyword) {
//	        if (keyword != null) {
//	            return repo.search(keyword);
//	        }
//	        return repo.findAll();
//	    }
//
//}
