package com.webservice;

import java.util.List;
import javax.inject.Inject;
import javax.persistence.EntityManager;
 
import javax.persistence.Query;
import javax.ws.rs.*;

import com.entity.Book;


@Path("/list")
public class RESTService {
	  
	@Inject
	private EntityManager em;    

	  
	@GET
	//@Produces("text/xml")
	@Produces("application/json")
	 public List<Book> listUsers() {
	  
	   Query query = em.createQuery("FROM com.entity.Book");
	   List <Book> list =  query.getResultList();
	 
	   return list;
	 }}
