package fr.formation.developers.controllers;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.formation.developers.domain.dtos.DeveloperCreate;
import fr.formation.developers.domain.dtos.DeveloperUpdateBirthDate;
import fr.formation.developers.domain.dtos.DeveloperView;
import fr.formation.developers.services.DeveloperService;

@RestController
@RequestMapping("/developers")
public class DeveloperController {

    private final DeveloperService service;

    public DeveloperController(DeveloperService service) {
	this.service = service;
    }

    @PostMapping
    public void create(@Valid @RequestBody DeveloperCreate developer) {
	System.out.println("CONTROLLER CREATE");
	System.out.println(developer);
	service.create(developer);
    }

    @GetMapping("/{pseudo}")
    public DeveloperView getByPseudo(@PathVariable("pseudo") String pseudo) {
	System.out.println("CONTROLLER GET");
	return service.getByPseudo(pseudo);
    }

    // "Patch" modifie partiellement une ressource
    // -- "Put" créé ou modifie en fonction de l'existence ou non des données
    // (rarement utilisé car peu spécifique)
    @PatchMapping("/{pseudo}/birth-date")
    public void updateBirthDate(@PathVariable("pseudo") String pseudo,
	    @Valid @RequestBody DeveloperUpdateBirthDate partial) {
	System.out.println("CONTROLLER UPDATE");
	service.updateBirthDate(pseudo, partial);
    }

    @DeleteMapping("/delete/{pseudo}")
    public void delete(@PathVariable("pseudo") String pseudo) {
	System.out.println("CONTROLLER DELETE");
	service.delete(pseudo);
    }

}
