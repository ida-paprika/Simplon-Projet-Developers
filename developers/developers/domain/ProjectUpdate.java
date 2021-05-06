package fr.formation.developers.domain;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

public class ProjectUpdate {

	@NotEmpty @NotBlank @Size(min = 100, max = 1000)
	private String description;
	
	@Positive
	private Integer annualBudget;

	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Integer getAnnualBudget() {
		return annualBudget;
	}
	public void setAnnualBudget(Integer annualBudget) {
		this.annualBudget = annualBudget;
	}
	
	
}
