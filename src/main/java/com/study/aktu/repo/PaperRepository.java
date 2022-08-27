package com.study.aktu.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.study.aktu.model.Paper;

public interface PaperRepository extends JpaRepository<Paper, Long> {


	 Iterable<Paper> findAllByPapernameContainingIgnoreCaseOrSemesterContainingIgnoreCaseOrBranchContainingIgnoreCaseOrSessionContainingIgnoreCase(String papername, String semester,String branch,String session);

}
