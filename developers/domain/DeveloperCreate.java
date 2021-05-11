package fr.formation.developers.domain;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import fr.formation.developers.validation.Majority;

public class DeveloperCreate {
	
	@NotEmpty @NotBlank @Size(min = 3, max = 15)
	private String pseudo;
	
	@NotEmpty @NotBlank @Size(min = 2, max = 15)
	private String firstName;
	
	@NotEmpty @NotBlank @Size(min = 3, max = 20)
	private String lastName;
	
	@NotNull @Past @Majority
	private LocalDate birthDate; // format yyyy-MM-dd
	
	
	public DeveloperCreate() {
		
	}
	
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
		return "Développeur " + pseudo + " : "+ firstName + " " + lastName
				+ ", né le " + formatedDate(birthDate);
	}
	
	
// FUNCTIONS
	public String formatedDate(LocalDate date) {
		DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String formatedDate = date.format(dateFormat);
		return formatedDate;
	}
	
	
}
