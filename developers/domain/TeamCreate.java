package fr.formation.developers.domain;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class TeamCreate {
	
	@NotEmpty @NotBlank @Size(min = 3, max = 20)
	private String name;
	
	@NotNull
	private boolean agile;
	
	public TeamCreate() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isAgile() {
		return agile;
	}
	public void setAgile(boolean agile) {
		this.agile = agile;
	}

	@Override
	public String toString() {
		return "Team \"" + name + "\" | agile = " + agile;
	}

	
}
