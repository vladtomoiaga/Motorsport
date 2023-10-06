package org.example;

public class Driver implements Information{
    private String firstName;
    private String lastName;

    private Team team;
    private byte raceNumber;
    private int raceVictories;
    private byte driversTitles;

    public Driver(String firstName, String lastName, Team team, byte raceNumber, int raceVictories, byte driversTitles) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.team = team;
        this.raceNumber = (byte) Math.abs(raceNumber);
        this.raceVictories = Math.abs(raceVictories);
        this.driversTitles = (byte) Math.abs(driversTitles);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Team getTeam() {
        return team;
    }

    public byte getRaceNumber() {
        return raceNumber;
    }

    public int getRaceVictories() {
        return raceVictories;
    }

    public byte getDriversTitles() {
        return driversTitles;
    }


    /** Most important information about the driver */
    @Override
    public void details() {
        System.out.println(firstName + " " + lastName + " with the racing number " + raceNumber + " has a record of " + raceVictories + " victories.");
    }

    @Override
    public String toString() {
        return firstName.substring(0,1) + ". " + lastName + " - " + team;
    }
}
