package com.study.aktu.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.study.aktu.model.Quantum;

public interface QuantumRepository extends JpaRepository<Quantum, Long> {

//	public List<Quantum> findBynameContaining(String name);

	 Iterable<Quantum> findAllByNameContainingIgnoreCaseOrCourseContainingIgnoreCaseOrBranchContainingIgnoreCase(
			String name, String course, String branch);

}
