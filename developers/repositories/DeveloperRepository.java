package fr.formation.developers.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.formation.developers.domain.dtos.IDeveloperView;
import fr.formation.developers.domain.entities.Developer;

@Repository
public interface DeveloperRepository extends JpaRepository<Developer, Long> {
    Optional<Developer> findByPseudo(String pseudo);

    Optional<IDeveloperView> findByFirstNameAndLastName(String string,
	    String string2);
}
