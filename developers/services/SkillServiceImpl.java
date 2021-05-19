package fr.formation.developers.services;

import org.springframework.stereotype.Service;

import fr.formation.developers.domain.dtos.SkillCreate;
import fr.formation.developers.domain.dtos.SkillView;

@Service
public class SkillServiceImpl implements SkillService {

    @Override
    public SkillView getById(Long id) {
	System.out.println("call in service");
	SkillView skill = new SkillView();
	skill.setName("SpringBoot " + id);
	return skill;
    }

    @Override
    public void create(SkillCreate skill) {
	System.out.println("[Service] " + skill);
    }

}
