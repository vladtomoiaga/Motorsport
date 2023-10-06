package org.example;

public class FormulaOneTeam extends Team implements Information {

   public static final int COST_CAP_BUDGET = 140;
   private boolean racingAcademy;


    public FormulaOneTeam(String teamName, String teamPrincipal, Engine engine, int raceVictories, int constructorTitles, int driversTitles, boolean racingAcademy) {
        super(teamName, teamPrincipal, engine, raceVictories, constructorTitles, driversTitles);
        this.racingAcademy = racingAcademy;
    }

    /** Important information about the team */
    @Override
    public void details() {
        System.out.println("Formula One Team " + getTeamName() + ":");
        System.out.println("\t" + "Team principal " + getTeamPrincipal());
        System.out.println("\t" + getTeamName() + " has " + getRaceVictories() + " victories, " + getConstructorTitles() + " constructor titles and " + getDriversTitles() + " driver titles.");
        System.out.println("\t" + "For this season the cost cap is $" + COST_CAP_BUDGET + "m.");
        System.out.println("\t" + getTeamName() + " Racing Academy: " + racingAcademy);
    }
}
