/**
 * 
 */
package com.tquila.demo.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.tquila.demo.controller.PersonController;
import com.tquila.demo.model.Amenity;
import com.tquila.demo.model.Person;

/**
 * @author sutee
 *
 */
@Repository
public class AmenityDao {
	
	private static final Logger logger = LoggerFactory.getLogger(AmenityDao.class);

	@PersistenceContext
	private EntityManager entityManager;
	
	@Transactional
	public Amenity save(Amenity amenity) {
//		if (person.getId() == null) {
//			entityManager.persist(person);
//			return person;
//		} else {
		logger.info("Insert Data to Amenity Table");	
		return entityManager.merge(amenity);
		}		
	
	
	  
	    @SuppressWarnings("unchecked")
		public List<Amenity> getAmenity() {
		return entityManager.createQuery("select a from Amenity a").getResultList();
	     }

	   
	}	

 

