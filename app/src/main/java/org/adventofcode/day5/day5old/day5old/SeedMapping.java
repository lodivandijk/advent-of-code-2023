package org.adventofcode.day5.day5old.day5old;

import java.util.ArrayList;

public class SeedMapping {
    private String soilType;
    private ArrayList<ConvertNumbers> seedIndex;

    public SeedMapping(String soilType, ArrayList<ConvertNumbers> seedIndex) {
        this.soilType = soilType;
        this.seedIndex = seedIndex;
    }

    public String getSoilType() {
        return soilType;
    }

    public void setSoilType(String soilType) {
        this.soilType = soilType;
    }

    public ArrayList<ConvertNumbers> getSeedIndex() {
        return seedIndex;
    }

    public void setSeedIndex(ArrayList<ConvertNumbers> seedIndex) {
        this.seedIndex = seedIndex;
    }

    @Override
    public String toString() {
        return "SeedMapping{" +
                "soilType='" + soilType + '\'' +
                ", seedIndex=" + seedIndex +
                "}\n";
    }
}
