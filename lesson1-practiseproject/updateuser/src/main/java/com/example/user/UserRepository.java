package com.example.user;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends CrudRepository<User, Long> {
	@Query(value = "SELECT c FROM Customer c WHERE c.id LIKE '%' || :keyword || '%'")
	public List<User> search(@Param("keyword") String keyword);
}
