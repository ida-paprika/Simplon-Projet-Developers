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
import fr.formation.developers.domain.dtos.IDeveloperView;
import fr.formation.developers.services.DeveloperService;

@RestController
@RequestMapping("/developers")
public class DeveloperController {

    private final DeveloperService service;

    public DeveloperController(DeveloperService service) {
	this.service = service;
    }

    @PostMapping
    public void create(@Valid @RequestBody DeveloperCreate dto) {
	service.create(dto);
    }

    @GetMapping("/{id}")
    public DeveloperView getById(@PathVariable("id") Long id) {
	return service.getById(id);
    }

    @GetMapping("/{pseudo}/by-pseudo")
    public DeveloperView getByPseudo(@PathVariable("pseudo") String pseudo) {
	return service.getByPseudo(pseudo);
    }

    // "Patch" modifie partiellement une ressource
    // -- "Put" créé ou modifie en fonction de l'existence ou non des données
    // (rarement utilisé car peu spécifique)
    @PatchMapping("/{id}/birth-date")
    public void updateBirthDate(@PathVariable("id") Long id,
	    @Valid @RequestBody DeveloperUpdateBirthDate partial) {
	service.updateBirthDate(id, partial);
    }

    @GetMapping("/find")
    public IDeveloperView find() {
	return service.find();
    }

    @DeleteMapping("/{id}/delete")
    public void delete(@PathVariable("id") Long id) {
	service.delete(id);
    }

}
