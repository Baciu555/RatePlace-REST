package com.baciu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.baciu.entity.Place;
import com.baciu.exception.PlaceExistsException;
import com.baciu.repository.PlaceRepository;
import com.baciu.service.PlaceService;

@RestController
public class PlaceController {
	
	@Autowired
	private PlaceService placeService;
	
	@Autowired
	private PlaceRepository placeRepository;

	@GetMapping("places")
	public List<Place> getPlaces() {
		return placeService.getAll();
	}
	
	@GetMapping("places/{id}")
	public Place getPlaceById(@PathVariable("id") int id) {
		return placeService.getPlace(id);
	}
	
	@PostMapping("places")
	public void addPlace(@RequestBody Place place) {
		try {
			placeService.addPlace(place);
		} catch (PlaceExistsException e) {
			e.printStackTrace();
		}
	}

	@PutMapping("places/{id}")
	public void updatePlace(@RequestBody Place place) {
		placeRepository.save(place);
	}
	
	@DeleteMapping("places/{id}")
	public void deletePlace(@PathVariable("id") int id) {
		placeRepository.delete(id);
	}
}
