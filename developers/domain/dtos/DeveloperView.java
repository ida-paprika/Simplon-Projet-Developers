package fr.formation.developers.domain.dtos;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DeveloperView {

    private String pseudo;
    private String firstName;
    private String lastName;
    private LocalDate birthDate; // format yyyy-MM-dd

    public String getPseudo() {
	return pseudo;
    }

    public void setPseudo(String pseudo) {
	this.pseudo = pseudo;
    }

    public String getFirstName() {
	return firstName;
    }

    public void setFirstName(String firstName) {
	this.firstName = firstName;
    }

    public String getLastName() {
	return lastName;
    }

    public void setLastName(String lastName) {
	this.lastName = lastName;
    }

    public LocalDate getBirthDate() {
	return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
	this.birthDate = birthDate;
    }

    @Override
    public String toString() {
	return "Développeur " + pseudo + " : " + firstName + " " + lastName
		+ ", né le " + formatedDate(birthDate);
    }

// FUNCTIONS
    public String formatedDate(LocalDate date) {
	DateTimeFormatter dateFormat = DateTimeFormatter
		.ofPattern("dd/MM/yyyy");
	String formatedDate = date.format(dateFormat);
	return formatedDate;
    }

}
