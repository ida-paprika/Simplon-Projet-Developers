package fr.formation.developers.domain.dtos;

import java.time.LocalDate;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;

public class DeveloperUpdateBirthDate {

    @NotNull
    @Past
    private LocalDate birthDate;

    public DeveloperUpdateBirthDate() {
    }

    public LocalDate getBirthDate() {
	return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
	this.birthDate = birthDate;
    }

    @Override
    public String toString() {
	return "DeveloperUpdate [birthDate=" + birthDate + "]";
    }

}
