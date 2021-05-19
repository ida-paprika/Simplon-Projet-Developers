package fr.formation.developers.domain.dtos;

import java.time.LocalDate;

public class ProjectView {

    private String name;
    private String description;
    private LocalDate startDate;
    private LocalDate endDate;
    private Integer annualBudget;

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

    public Integer getAnnualBudget() {
	return annualBudget;
    }

    public void setAnnualBudget(Integer annualBudget) {
	this.annualBudget = annualBudget;
    }

    @Override
    public String toString() {
	return "Projet '" + name + "'\nDescription : " + description
		+ "\nDate de début : " + startDate + " - Date de fin : "
		+ endDate + "\nBudget annuel : " + annualBudget + "€";
    }

}
