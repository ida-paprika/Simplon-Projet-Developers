package fr.formation.developers.services;

import javax.validation.Valid;

import fr.formation.developers.domain.dtos.ProjectCreate;
import fr.formation.developers.domain.dtos.ProjectEndDate;
import fr.formation.developers.domain.dtos.ProjectUpdate;
import fr.formation.developers.domain.dtos.ProjectView;

public interface ProjectService {

    void create(@Valid ProjectCreate project);

    ProjectView getByName(String name);

    void updateDescriptionAndBudget(String name, @Valid ProjectUpdate partial);

    void setProjectEndDate(String name, @Valid ProjectEndDate partial);

}
