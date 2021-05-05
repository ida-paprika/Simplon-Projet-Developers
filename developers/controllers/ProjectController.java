package fr.formation.developers.controllers;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.formation.developers.domain.Project;

@RestController
@RequestMapping("/projects")
public class ProjectController {

	@PostMapping
	public void create(@Valid @RequestBody Project project) {
		System.out.println("----------");
		System.out.println(project);
		System.out.println("----------");
	}
	
}
