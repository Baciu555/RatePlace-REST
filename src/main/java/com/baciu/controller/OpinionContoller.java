package com.baciu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.baciu.entity.Opinion;
import com.baciu.repository.OpinionRepository;
import com.baciu.service.OpinionService;

@RestController
public class OpinionContoller {
	
	@Autowired
	private OpinionService opinionService;
	
	@Autowired
	private OpinionRepository opinionRepository;

	@GetMapping("opinions/id")
	public Opinion getOpinionById(@PathVariable int id) {
		return opinionRepository.findOne(id);
	}
	
	@PostMapping("opinions")
	public Opinion addOpinion(@RequestBody Opinion opinion) {
		return opinionRepository.save(opinion);
	}
	
	@PutMapping("opinions")
	public void updateOpinion(@RequestBody Opinion opinion) {
		opinionRepository.save(opinion);
	}
	
	@DeleteMapping("opinions/{id}")
	public void deleteOpinion(@PathVariable int id) {
		opinionRepository.delete(id);
	}

}
