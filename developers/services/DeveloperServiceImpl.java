package fr.formation.developers.services;

import java.time.LocalDate;

import org.springframework.stereotype.Service;

import fr.formation.developers.domain.dtos.DeveloperCreate;
import fr.formation.developers.domain.dtos.DeveloperUpdateBirthDate;
import fr.formation.developers.domain.dtos.DeveloperView;

@Service
public class DeveloperServiceImpl implements DeveloperService {

    @Override
    public void create(DeveloperCreate developer) {
	System.out.println("SERVICE CREATE");
	System.out.println(developer);
    }

    @Override
    public DeveloperView getByPseudo(String pseudo) {
	DeveloperView developer = new DeveloperView();
	developer.setPseudo(pseudo);
	developer.setFirstName("Bilbo");
	developer.setLastName("BAGGINS");
	LocalDate date = LocalDate.of(1752, 12, 01);
	developer.setBirthDate(date);
	System.out.println("SERVICE GET");
	System.out.println(developer);
	return developer;
    }

    @Override
    public void updateBirthDate(String pseudo,
	    DeveloperUpdateBirthDate partial) {
//	System.out.println("Partial object=" + partial);
//	DeveloperCreate developer = new DeveloperCreate();
//	developer.setPseudo(pseudo);
//	developer.setFirstName(partial.getFirstName());
//	developer.setLastName("MARSHALL");
//	developer.setBirthDate(partial.getBirthDate());
	System.out.println("SERVICE UPDATE");
	System.out.println("Update birth date of '" + pseudo
		+ "' with new date '" + partial.getBirthDate() + "'");
    }

    @Override
    public void delete(String pseudo) {
	System.out.println("SERVICE DELETE");
	System.out.println("Développeur '" + pseudo + "' éradiqué è_é");
    }

}
