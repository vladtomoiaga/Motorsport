package org.example;

public class GrandPrix implements Information {

    private String nameGrandPrix;
    private String nameCircuit;
    private String countryCircuit;
    private int lengthCircuit;
    private byte numberLaps;

    public GrandPrix(String nameGrandPrix, String nameCircuit, String countryCircuit, int lengthCircuit, byte numberLaps) {
        this.nameGrandPrix = nameGrandPrix;
        this.nameCircuit = nameCircuit;
        this.countryCircuit = countryCircuit;
        this.lengthCircuit = lengthCircuit;
        this.numberLaps = numberLaps;
    }

    public String getNameGrandPrix() {
        return nameGrandPrix;
    }

    public String getNameCircuit() {
        return nameCircuit;
    }

    public String getCountryCircuit() {
        return countryCircuit;
    }

    public int getLengthCircuit() {
        return lengthCircuit;
    }

    public byte getNumberLaps() {
        return numberLaps;
    }

    /** Important information about the Grand Prix */
    @Override
    public void details() {
        System.out.println(nameGrandPrix + " is hosted on the circuit " + nameCircuit + " (" + countryCircuit + ") has a length of" + lengthCircuit + " km and is disputed during the " + numberLaps + " laps.");
    }

    @Override
    public String toString() {
        return nameGrandPrix + " (" + countryCircuit.toUpperCase() + ")";
    }
}
