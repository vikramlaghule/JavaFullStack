package App.Courior.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import App.Courior.entity.Consignment;

@Repository
public interface ConsignmentRepo extends JpaRepository<Consignment, Integer>{

		
}
