package fr.formation.developers.controllers;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.formation.developers.domain.dtos.ProjectCreate;
import fr.formation.developers.domain.dtos.ProjectEndDate;
import fr.formation.developers.domain.dtos.ProjectUpdate;
import fr.formation.developers.domain.dtos.ProjectView;
import fr.formation.developers.services.ProjectService;

@RestController
@RequestMapping("/projects")
public class ProjectController {

    private final ProjectService service;

    public ProjectController(ProjectService service) {
	this.service = service;
    }

    @PostMapping
    public void create(@Valid @RequestBody ProjectCreate project) {
	service.create(project);
    }

    @GetMapping("/{name}")
    public ProjectView getByName(@PathVariable("name") String name) {
	return service.getByName(name);
    }

    @PatchMapping("/update/{name}")
    public void updateDescriptionAndBudget(@PathVariable("name") String name,
	    @Valid @RequestBody ProjectUpdate partial) {
	service.updateDescriptionAndBudget(name, partial);
    }

    @PatchMapping("/close/{name}")
    public void setProjectEndDate(@PathVariable("name") String name,
	    @Valid @RequestBody ProjectEndDate partial) {
	service.setProjectEndDate(name, partial);
    }

}
