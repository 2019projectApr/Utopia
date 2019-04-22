package com.smppthstack.app.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.smppthstack.app.model.Plane;
import com.smppthstack.app.repository.PlaneRepository;

@RestController
public class MyController {

	

		@Autowired
		PlaneRepository adao;

		@RequestMapping(value = "/planes", method = RequestMethod.GET, produces = "application/json")
		public List<Plane> readAllPlanes(@RequestParam(required=false) String searchString) {
			List<Plane> authors = new ArrayList<>();
			try {
				if (searchString==null) {
					authors = adao.findAll();
				} else {
					authors = adao.readPlaneById(Integer.getInteger(searchString));
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			return authors;
		}
}
