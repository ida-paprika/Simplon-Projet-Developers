package fr.formation.developers.services;

import org.springframework.stereotype.Service;

import fr.formation.developers.domain.dtos.SkillCreate;
import fr.formation.developers.domain.dtos.SkillView;
import fr.formation.developers.domain.entities.Skill;
import fr.formation.developers.repositories.SkillRepository;

@Service
public class SkillServiceImpl implements SkillService {

    private final SkillRepository repo;

    public SkillServiceImpl(SkillRepository repository) {
	this.repo = repository;
    }

    @Override
    public void create(SkillCreate dto) {
	Skill skill = new Skill();
	skill.setName(dto.getName());
	repo.save(skill);
    }

    @Override
    public SkillView getById(Long id) {
	Skill skill = repo.findById(id).get();
	SkillView view = new SkillView();
	view.setName(skill.getName());
	return view;
    }

    @Override
    public void update(Long id, SkillCreate dto) {
	Skill skill = repo.findById(id).get();
	System.out.println(skill);
	skill.setName(dto.getName());

    }

    @Override
    public void delete(Long id) {
	repo.deleteById(id);
    }

    @Override
    public SkillView getByName(String name) {
	Skill skill = repo.findByName(name).get();
	SkillView view = new SkillView();
	view.setName(skill.getName());
	return view;
    }

}
