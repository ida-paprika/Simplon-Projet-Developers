package fr.formation.developers.services;

import fr.formation.developers.domain.dtos.DeveloperCreate;
import fr.formation.developers.domain.dtos.DeveloperUpdateBirthDate;
import fr.formation.developers.domain.dtos.DeveloperView;

public interface DeveloperService {

    void create(DeveloperCreate developer);

    DeveloperView getByPseudo(String pseudo);

    void updateBirthDate(String pseudo, DeveloperUpdateBirthDate partial);

    void delete(String pseudo);

}
