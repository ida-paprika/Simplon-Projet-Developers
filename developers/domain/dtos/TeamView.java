package fr.formation.developers.domain.dtos;

public class TeamView {

    private String name;
    private boolean agile;

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
