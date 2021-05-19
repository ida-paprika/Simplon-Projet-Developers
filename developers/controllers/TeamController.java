package fr.formation.developers.controllers;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.formation.developers.domain.dtos.TeamCreate;
import fr.formation.developers.domain.dtos.TeamView;

@RestController
@RequestMapping("/teams")
public class TeamController {

    @PostMapping
    public void create(@Valid @RequestBody TeamCreate team) {
	System.out.println(team);
    }

    @GetMapping("/{name}")
    public TeamView getByName(@PathVariable String name) {

	return null;
    }

    @DeleteMapping("/delete/{name}")
    public void delete(@PathVariable("name") String name) {
	System.out.println("Equipe '" + name + "' éradiquée è_é");
    }

}
