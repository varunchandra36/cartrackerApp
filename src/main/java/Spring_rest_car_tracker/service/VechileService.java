package Spring_rest_car_tracker.service;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;

import spring_rest.car_tracker.entity.Vechile;
import spring_rest.car_tracker.entity.VechileDetails;

public interface VechileService {
	public List<Vechile> findAll();
	public Vechile findOne(String id);
	public List<Vechile> add(List<Vechile> vechiles);
	public VechileDetails addvechiledetails(VechileDetails vechiledetails);
	
			//comment
}
