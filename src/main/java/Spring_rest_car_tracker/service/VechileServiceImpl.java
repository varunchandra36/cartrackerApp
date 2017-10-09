package Spring_rest_car_tracker.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import spring_rest.car_tracker.entity.Vechile;
import spring_rest.car_tracker.entity.VechileDetails;
import spring_rest.car_tracker.repository.VechileRepository;
@Service
public class VechileServiceImpl  implements VechileService{
	VechileRepository repository;
	

	public VechileServiceImpl(VechileRepository repository) {
		super();
		this.repository = repository;
	}

	@Override
	@Transactional(readOnly = true)
	public List<Vechile> findAll() {
		return repository.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Vechile findOne(String id) {
		
		return repository.findOne(id);
	}

	@Override
	@Transactional
	public List<Vechile> add(List<Vechile> vechiles) {
		List<Vechile> ListAdded=new ArrayList<Vechile>();
		for (Vechile vechile : vechiles) {
		ListAdded.add(repository.addOne(vechile));   
		}
		return ListAdded;
	}

	@Override
	public VechileDetails addvechiledetails(VechileDetails vechiledetails) {
	
		return repository.addvechileDetails(vechiledetails);
	}

}
