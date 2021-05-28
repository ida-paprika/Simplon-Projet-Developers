package fr.formation.developers.services;

import org.springframework.stereotype.Service;

import fr.formation.developers.domain.dtos.DeveloperCreate;
import fr.formation.developers.domain.dtos.DeveloperUpdateBirthDate;
import fr.formation.developers.domain.dtos.DeveloperView;
import fr.formation.developers.domain.dtos.IDeveloperView;
import fr.formation.developers.domain.entities.Developer;
import fr.formation.developers.repositories.DeveloperRepository;

@Service
public class DeveloperServiceImpl implements DeveloperService {

    private final DeveloperRepository repo;

    public DeveloperServiceImpl(DeveloperRepository repo) {
	this.repo = repo;
    }

    @Override
    public void create(DeveloperCreate dto) {
	Developer entity = new Developer();
	entity.setPseudo(dto.getPseudo());
	entity.setFirstName(dto.getFirstName());
	entity.setLastName(dto.getLastName());
	entity.setBirthDate(dto.getBirthDate());
	repo.save(entity);
    }

    @Override
    public DeveloperView getById(Long id) {
	Developer entity = repo.findById(id).get();
	DeveloperView view = new DeveloperView();
	view.setPseudo(entity.getPseudo());
	view.setFirstName(entity.getFirstName());
	view.setLastName(entity.getLastName());
	view.setBirthDate(entity.getBirthDate());
	return view;
    }

    @Override
    public DeveloperView getByPseudo(String pseudo) {
	Developer entity = repo.findByPseudo(pseudo).get();
	DeveloperView view = new DeveloperView();
	view.setPseudo(entity.getPseudo());
	view.setFirstName(entity.getFirstName());
	view.setLastName(entity.getLastName());
	view.setBirthDate(entity.getBirthDate());
	return view;
    }

    @Override
    public void updateBirthDate(Long id, DeveloperUpdateBirthDate partial) {
	Developer entity = repo.findById(id).get();
	entity.setBirthDate(partial.getBirthDate());
	repo.save(entity);
    }

    @Override
    public void delete(Long id) {
	repo.deleteById(id);
    }

    @Override
    public IDeveloperView find() {
	String firstName = "Bilbo";
	String lastName = "Baggins";
	return repo.findByFirstNameAndLastName(firstName, lastName).get();

    }

}
