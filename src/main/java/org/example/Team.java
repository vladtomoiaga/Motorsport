package org.example;

import java.util.LinkedList;

public abstract class Team {
    private String teamName;
    private String teamPrincipal;
    private Engine engine;
    private int raceVictories;
    private int constructorTitles;
    private int driversTitles;
    // private LinkedList<String> drivers = new LinkedList<>();

    public Team(String teamName, String teamPrincipal, Engine engine, int raceVictories, int constructorTitles, int driversTitles) {
        this.teamName = teamName;
        this.teamPrincipal = teamPrincipal;
        this.engine = engine;
        this.raceVictories = Math.abs(raceVictories);
        this.constructorTitles = Math.abs(constructorTitles);
        this.driversTitles = Math.abs(driversTitles);
    }

    public String getTeamName() {
        return teamName;
    }

    public String getTeamPrincipal() {
        return teamPrincipal;
    }

    public Engine getEngine() {
        return engine;
    }

    public int getRaceVictories() {
        return raceVictories;
    }

    public int getConstructorTitles() {
        return constructorTitles;
    }

    public int getDriversTitles() {
        return driversTitles;
    }

    @Override
    public String toString() {
        return teamName;
    }
}
