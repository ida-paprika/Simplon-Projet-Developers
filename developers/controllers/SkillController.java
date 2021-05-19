package fr.formation.developers.controllers;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.formation.developers.domain.dtos.SkillCreate;
import fr.formation.developers.domain.dtos.SkillView;
import fr.formation.developers.services.SkillService;

@RestController
@RequestMapping("/skills")
public class SkillController {

    // @Autowired // JEE = @Inject
    private final SkillService service;

    // nécessité d'un constructeur pour assigner une valeur à "final"
    public SkillController(SkillService service) {
	this.service = service;
    }

    @GetMapping("/{id}")
    public SkillView getById(@PathVariable("id") Long id) {
	System.out.println("call in controller");
	return service.getById(id);
    }

    @PostMapping
    public void create(@Valid @RequestBody SkillCreate skill) {
	System.out.println("[Controller] " + skill);
	service.create(skill);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable("id") Long id) {
	System.out.println("Compétence n°" + id + " supprimée");
    }

}
