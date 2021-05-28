package fr.formation.developers.services;

import org.springframework.stereotype.Service;

import fr.formation.developers.domain.dtos.SkillCreate;
import fr.formation.developers.domain.dtos.SkillView;
import fr.formation.developers.domain.entities.Skill;
import fr.formation.developers.repositories.SkillRepository;

@Service
public class SkillServiceImpl implements SkillService {

    private final SkillRepository repo;

    public SkillServiceImpl(SkillRepository repo) {
	this.repo = repo;
    }

    @Override
    public void create(SkillCreate dto) {
	Skill entity = new Skill();
	entity.setName(dto.getName());
	repo.save(entity);
    }

    @Override
    public SkillView getById(Long id) {
	Skill entity = repo.findById(id).get();
	SkillView view = new SkillView();
	view.setName(entity.getName());
	return view;
    }

    @Override
    public void update(Long id, SkillCreate dto) {
	Skill entity = repo.findById(id).get();
	entity.setName(dto.getName());
	repo.save(entity);
    }

    @Override
    public void delete(Long id) {
	repo.deleteById(id);
    }

    @Override
    public SkillView getByName(String name) {
	Skill entity = repo.findByName(name).get();
	SkillView view = new SkillView();
	view.setName(entity.getName());
	return view;
    }

}
