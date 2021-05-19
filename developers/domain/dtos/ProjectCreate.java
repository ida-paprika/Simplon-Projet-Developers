package fr.formation.developers.domain.dtos;

import java.time.LocalDate;

import javax.validation.constraints.FutureOrPresent;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

import fr.formation.developers.validation.DifferentValues;

//@DifferentValues(firstField = "name", secondField = "description")
@DifferentValues
public class ProjectCreate {

    @NotEmpty
    @NotBlank
    @Size(min = 1, max = 255)
    private String name;

    @NotEmpty
    @NotBlank
    @Size(min = 1, max = 1000)
    private String description;

    @NotNull
    @FutureOrPresent
    private LocalDate startDate;

    @Null
    private LocalDate endDate;

    @Positive
    private Integer annualBudget;

    public ProjectCreate() {
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
