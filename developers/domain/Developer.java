package fr.formation.developers.domain;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

public class Developer {
	
	@NotEmpty @NotBlank @Size(min = 3, max = 15)
	private String nickName;
	
	@NotEmpty @NotBlank @Size(min = 2, max = 15)
	private String firstName;
	
	@NotEmpty @NotBlank @Size(min = 3, max = 20)
	private String lastName;
	
	@NotNull @Past
	private LocalDate birthDate; // format yyyy-MM-dd
	
	
	public Developer() {
		
	}
	
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
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
		return "Développeur " + nickName + " : "+ firstName + " " + lastName
				+ ", né le " + formatedDate(birthDate);
	}
	
	
// FUNCTIONS
	public String formatedDate(LocalDate date) {
		DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String formatedDate = date.format(dateFormat);
		return formatedDate;
	}
	
	
}
