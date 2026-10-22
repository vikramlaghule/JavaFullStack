package App.Courior.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import App.Courior.entity.Consignment;
import App.Courior.repository.ConsignmentRepo;

@Service
public class ConsignmentService {
	
	@Autowired
	private ConsignmentRepo repo;
	
	public String saveConsignment(Consignment con)
	{
	
		repo.save(con);
		return "saved successfully";
	}
	
	public Page<Consignment> getAll()
	{
		
		repo.findAll();
		return null;
	}
	
}
