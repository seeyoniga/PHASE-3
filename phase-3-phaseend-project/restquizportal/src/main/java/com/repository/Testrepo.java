package com.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.entities.Test;
@Repository
public interface Testrepo extends JpaRepository<Test, Integer>{
	
	@Query("Select t from Test as t group by t.userid")
	List<Test> getIndividual();

}
