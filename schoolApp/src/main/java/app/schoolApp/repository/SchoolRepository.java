package app.schoolApp.repository;

import app.schoolApp.entity.School;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SchoolRepository extends JpaRepository<School, Long> {
	
	
	List<School> findByCity(String city);
}
