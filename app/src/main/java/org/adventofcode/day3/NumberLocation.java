package org.adventofcode.day3;

import java.util.ArrayList;

public class NumberLocation {
    private int number;
    private ArrayList<Grid> gridLocations;

    public NumberLocation(int number, ArrayList<Grid> gridLocations) {
        this.number = number;
        this.gridLocations = gridLocations;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public ArrayList<Grid> getGridLocations() {
        return gridLocations;
    }

    public void setGridLocations(ArrayList<Grid> gridLocations) {
        this.gridLocations = gridLocations;
    }

    @Override
    public String toString() {
        return "{" +
                "number=" + number +
                ", gridLocations=" + gridLocations +
                "}";
    }
}
