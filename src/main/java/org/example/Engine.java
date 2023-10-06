package org.example;

public class Engine {
    private String engineName;
    private String engineType;
    private byte cylinder;

    public Engine(String engineName, String engineType, byte cylinder) {
        this.engineName = engineName;
        this.engineType = engineType;
        this.cylinder = cylinder;
    }

    public String getEngineName() {
        return engineName;
    }

    public String getEngineType() {
        return engineType;
    }

    public byte getCylinder() {
        return cylinder;
    }

    @Override
    public String toString() {
        return engineName;
    }
}
