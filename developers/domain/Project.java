package fr.formation.developers.domain;

import java.time.LocalDate;

import javax.validation.constraints.Future;
import javax.validation.constraints.FutureOrPresent;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

public class Project {
	
	@NotEmpty @NotBlank @Size(min = 1, max = 255)
	private String name;
	
	@NotEmpty @NotBlank @Size(min = 100, max = 1000)
	private String description;
	
	@NotNull @FutureOrPresent
	private LocalDate startDate;
	
	@NotNull @Future
	private LocalDate endDate;
	
	@Positive //rejète la valeur null, l'interprète comme 0, pourquoi ?
	private int annualBudget;
	
	public Project() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public LocalDate getStartDate() {
		return startDate;
	}
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}
	public LocalDate getEndDate() {
		return endDate;
	}
	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}
	public int getAnnualBudget() {
		return annualBudget;
	}
	public void setAnnualBudget(int annualBudget) {
		this.annualBudget = annualBudget;
	}

	@Override
	public String toString() {
		return "Projet '" + name + "'\nDescription : " + description + "\nDate de début : " + startDate
				+ " - Date de fin : " + endDate + "\nBudget annuel : " + annualBudget +"€";
	}

	
	
}
