package fr.formation.developers.controllers;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.formation.developers.domain.Skill;

@RestController
@RequestMapping("/skills")
public class SkillController {
	
	@GetMapping("/{id}")
	public Skill getById(@PathVariable("id") Long id) {
		Skill skill = new Skill();
		skill.setName("SpringBoot");
		return skill;
	}
	
	@PostMapping
	public void create(@Valid @RequestBody Skill skill) {
		System.out.println(skill);
	}
	
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable("id") Long id) {
		System.out.println("Compétence supprimée");
	}
	
}
