package com.ait.cars;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Stateless
@LocalBean
public class CarDAO {

	@PersistenceContext
	private EntityManager entityManager;
	
	public List<Car> getAllCars(){
		Query query = entityManager.createQuery("SELECT c FROM Car c");
		return query.getResultList();
}
	
	public Car getCarById(int id){
		return entityManager.find(Car.class, id);
	}
	
}
