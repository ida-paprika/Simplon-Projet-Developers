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

import fr.formation.developers.domain.Developer;

@RestController
@RequestMapping("/developers")
public class DeveloperController {

	private HashMap<String, Developer> arrayDeveloper = new HashMap<String, Developer>();
	
	@PostMapping
	public void create(@Valid @RequestBody Developer developer) {
		arrayDeveloper.put(developer.getNickName(), developer);
		System.out.println(developer);
	}
	
	@GetMapping("/{nickName}")
	public Developer getByNickName(@PathVariable("nickName") String nickName) {
		Developer developer = null;
		for (String n : arrayDeveloper.keySet()) {
			if (n.equalsIgnoreCase(nickName)) {
				developer = arrayDeveloper.get(n);
			}
		}
		return developer;
	}
	
	// "Patch" modifie partiellement une ressource
	// 		-- "Put" créé ou modifie en fonction de l'existence ou non des données (rarement utilisé car peu spécifique)
	@PatchMapping("/{nickName}/birth-date")
	public void updateBirthDate(@PathVariable("nickName") String nickName, 
			@Valid @RequestBody Developer partial) {
		Developer developer = this.getByNickName(nickName);
//		developer.setBirthDate(LocalDate.of(1500, 04, 01));
		developer.setBirthDate(partial.getBirthDate());
		System.out.println(developer);
	}
	
	@DeleteMapping("/delete/{nickName}")
	public void delete(@PathVariable("nickName") String nickName) {
		for (String n : arrayDeveloper.keySet()) {
			if (n.equalsIgnoreCase(nickName)) {
				arrayDeveloper.remove(n);
				System.out.println("Développeur '" + nickName + "' éradiqué");
			} else {
				System.out.println("Développeur '" + nickName + "' inconnu");
			}
		}
	}
	


	
}
