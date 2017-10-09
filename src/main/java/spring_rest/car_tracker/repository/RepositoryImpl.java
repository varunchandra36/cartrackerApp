package spring_rest.car_tracker.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import org.springframework.stereotype.Repository;

import Spring_rest_car_tracker.service.VechileService;

import spring_rest.car_tracker.entity.Vechile;
import spring_rest.car_tracker.entity.VechileDetails;
@Repository
public class RepositoryImpl implements VechileRepository {
	@PersistenceContext
	private EntityManager em;
	@Override
	public List<Vechile> findAll() {
		TypedQuery<Vechile> query = em.createNamedQuery("Vechile.findAll",Vechile.class);
		return query.getResultList();
	}

	@Override
	public Vechile findOne(String id) {
		return em.find(Vechile.class, id);
	}

	@Override
	public Vechile addOne(Vechile vechile) {
		em.persist(vechile);
		return vechile;
	}

	@Override
	public VechileDetails addvechileDetails(VechileDetails vechiledtails) {
		em.persist(vechiledtails.getTires());
		em.persist(vechiledtails);
		return null;
	}

	

}
