package fr.formation.developers.controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.formation.developers.domain.Team;

@RestController
@RequestMapping("/teams")
public class TeamController {
	
	@DeleteMapping("/delete/{name}")
	public void delete(@PathVariable("name") String name) {
		System.out.println("Equipe '" + name + "' éradiquée è_é");
	}
	
}
