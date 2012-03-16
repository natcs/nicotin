/**
 * 
 */
package com.tquila.demo.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.tquila.demo.dao.AmenityDao;
import com.tquila.demo.model.Amenity;
import com.tquila.demo.model.Person;

/**
 * @author sutee
 *
 */
@Controller
@RequestMapping("/Amenity/")
public class AmenityController {

	private static final Logger logger = LoggerFactory.getLogger(AmenityController.class);
@Autowired
private AmenityDao amenityDao;

@RequestMapping(method=RequestMethod.GET,value="test")
public ModelAndView checkAmenity() {		
//	logger.info("Received request to edit person id : "+id);				
	ModelAndView mav = new ModelAndView();		
		mav.setViewName("edit");
		Amenity amenity = null;
//		if (id == null) {
//		
//		} else {	
//			person = personDao.find(id);
//		}
		amenity = new Amenity();
		amenitysetting(amenity);
		amenityDao.save(amenity);
		mav.addObject("amenity", amenity);
		
		List<Amenity> amenityQuery = amenityDao.getAmenity();
		logger.info("Person Listing count = "+amenityQuery.size());
		mav.addObject("amenity",amenityQuery);
		mav.setViewName("testdata");
	return mav;
	
}

public Amenity amenitysetting(Amenity amenity){
	
    amenity.setAmenity("123112");
    amenity.setAmenityId("adf");
    amenity.setDescription("Description");
    amenity.setSortBy(0);
	return amenity;
	
}
}
