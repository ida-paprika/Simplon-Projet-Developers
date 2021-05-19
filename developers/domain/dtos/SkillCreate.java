package fr.formation.developers.domain.dtos;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import fr.formation.developers.validation.Uppercase;

public class SkillCreate {

    @NotEmpty
    @NotBlank
    @Size(min = 3, max = 20)
    @Uppercase
    private String name;

    public SkillCreate() {

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
