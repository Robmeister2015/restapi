package com.ait.cars;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/cars")
@Stateless
@LocalBean
public class CarWS {

	@EJB
	private CarDAO carDao;

	@GET
	@Produces({ MediaType.APPLICATION_JSON })
	public Response findAll() {
		System.out.println("Get all cars");
		final List<Car> car = carDao.getAllCars();
		return Response.status(200).entity(car).build();
	}
	
	@GET
	@Produces({ MediaType.APPLICATION_JSON })
	@Path("/{id}")
	public Response findCarById(@PathParam("id") final int id){
		Car carMatch = carDao.getCarById(id);
		return Response.status(200).entity(carMatch).build();
	}
}
