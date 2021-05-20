package fr.formation.developers.services;

import java.time.LocalDate;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import fr.formation.developers.domain.dtos.ProjectCreate;
import fr.formation.developers.domain.dtos.ProjectEndDate;
import fr.formation.developers.domain.dtos.ProjectUpdate;
import fr.formation.developers.domain.dtos.ProjectView;

@Service
public class ProjectServiceImpl implements ProjectService {

    @Override
    public void create(@Valid ProjectCreate project) {
	System.out.println("----------");
	System.out.println(project);
	System.out.println("----------");
    }

    @Override
    public ProjectView getByName(String name) {
	ProjectView project = new ProjectView();
	project.setName(name);
	project.setDescription("Lorem ipsum dolor sit amet, "
		+ "consectetur adipiscing elit. Etiam faucibus, "
		+ "ex interdum dapibus pellentesque, est odio aliquam nisi, "
		+ "sed ultricies elit ante eu nisi.");
	project.setStartDate(LocalDate.of(2021, 12, 01));
	project.setEndDate(LocalDate.of(2022, 12, 01));
	project.setAnnualBudget(9999);
	return project;
    }

    @Override
    public void updateDescriptionAndBudget(String name,
	    @Valid ProjectUpdate partial) {
	System.out.println("Update of '" + name + "'\n-> Description : "
		+ partial.getDescription() + "\n-> Budget : "
		+ partial.getAnnualBudget() + "€");
    }

    @Override
    public void setProjectEndDate(String name, @Valid ProjectEndDate partial) {
	System.out.println(
		"Deadline of '" + name + "' project : " + partial.getEndDate());
    }

}
