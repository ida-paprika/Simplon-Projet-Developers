package fr.formation.developers.controllers;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.formation.developers.domain.ProjectCreate;
import fr.formation.developers.domain.ProjectEndDate;
import fr.formation.developers.domain.ProjectUpdate;

@RestController
@RequestMapping("/projects")
public class ProjectController {

	@PostMapping
	public void create(@Valid @RequestBody ProjectCreate project) {
		System.out.println("----------");
		System.out.println(project);
		System.out.println("----------");
	}
	
	@PatchMapping("/update/{name}")
	public void updateDescriptionAnnualBudget(@PathVariable("name") String name, 
			@Valid @RequestBody ProjectUpdate partial) {
		System.out.println("Update of '"+name+"'\n-> Description : "+partial.getDescription()
		+"\n-> Budget : "+partial.getAnnualBudget()+"€");
	}
	
	@PatchMapping("/close/{name}")
	public void closeProject(@PathVariable("name") String name, 
			@Valid @RequestBody ProjectEndDate partial) {
		System.out.println("Deadline of '"+name+"' project : "+partial.getEndDate());
	}
	
}
