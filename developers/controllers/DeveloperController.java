package fr.formation.developers.controllers;

import java.time.LocalDate;
import java.util.HashMap;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.formation.developers.domain.DeveloperCreate;
import fr.formation.developers.domain.DeveloperUpdate;

@RestController
@RequestMapping("/developers")
public class DeveloperController {

	@PostMapping
	public void create(@Valid @RequestBody DeveloperCreate developer) {
		System.out.println(developer);
	}
	
	@GetMapping("/{nickName}")
	public DeveloperCreate getByNickName(@PathVariable("nickName") String pseudo) {
		DeveloperCreate developer = new DeveloperCreate();
		developer.setPseudo(pseudo);
		developer.setFirstName("Bilbo");
		developer.setLastName("BAGGINS");
		LocalDate date = LocalDate.of(1752, 12, 01);
		developer.setBirthDate(date);
		return developer;
	}
	
	// "Patch" modifie partiellement une ressource
	// 		-- "Put" créé ou modifie en fonction de l'existence ou non des données (rarement utilisé car peu spécifique)
	@PatchMapping("/{nickName}/birth-date")
	public void updateBirthDate(@PathVariable("nickName") String pseudo, 
			@Valid @RequestBody DeveloperUpdate partial) {
//		System.out.println("Partial object=" + partial);
//		DeveloperCreate developer = new DeveloperCreate();
//		developer.setPseudo(pseudo);
//		developer.setFirstName(partial.getFirstName());
//		developer.setLastName("MARSHALL");
//		developer.setBirthDate(partial.getBirthDate());
		System.out.println("Update birth date of '"+pseudo
				+"' with new date '"+partial.getBirthDate()+"'");
	}
	
	@DeleteMapping("/delete/{nickName}")
	public void delete(@PathVariable("nickName") String pseudo) {
		System.out.println("Développeur '" + pseudo + "' éradiqué è_é");
	}
	


	
}
