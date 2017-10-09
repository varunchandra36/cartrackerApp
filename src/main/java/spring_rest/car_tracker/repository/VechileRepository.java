package spring_rest.car_tracker.repository;

import java.util.List;

import spring_rest.car_tracker.entity.Vechile;
import spring_rest.car_tracker.entity.VechileDetails;

public interface VechileRepository {
	public List<Vechile> findAll();
	public Vechile findOne(String id);
	public Vechile addOne(Vechile vechile);
	public VechileDetails addvechileDetails(VechileDetails vechiledtails);
}
