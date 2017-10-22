package com.baciu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.baciu.entity.Type;
import com.baciu.service.TypeService;

@RestController
public class TypeController {
	
	@Autowired
	private TypeService typeService;
	
	@GetMapping("types")
	public List<Type> getAll() {
		return typeService.getAll();
	}

}
