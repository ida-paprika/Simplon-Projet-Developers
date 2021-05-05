package fr.formation.developers.domain;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;


public class Skill {
	
	@NotEmpty @NotBlank @Size(min = 3, max = 20)
	private String name;
	
	
	public Skill() {
		
	}

	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Skill \"" + name + "\"";
	}
	
	
}
