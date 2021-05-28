package fr.formation.developers.services;

import fr.formation.developers.domain.dtos.DeveloperCreate;
import fr.formation.developers.domain.dtos.DeveloperUpdateBirthDate;
import fr.formation.developers.domain.dtos.DeveloperView;
import fr.formation.developers.domain.dtos.IDeveloperView;

public interface DeveloperService {

    void create(DeveloperCreate dto);

    DeveloperView getById(Long id);

    DeveloperView getByPseudo(String pseudo);

    void updateBirthDate(Long id, DeveloperUpdateBirthDate partial);

    void delete(Long id);

    IDeveloperView find();

}
