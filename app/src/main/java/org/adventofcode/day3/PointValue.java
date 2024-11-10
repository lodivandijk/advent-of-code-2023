package org.adventofcode.day3;

import java.util.ArrayList;

public class PointValue {
    private static int value;
    private static ArrayList<Grid> points;
    private static ArrayList<Grid> addValuePoints;

    public PointValue(int value, ArrayList<Grid> points, ArrayList<Grid> addValuPoints) {
    this.value = value;
    this.points = points;
    this.addValuePoints = addValuPoints;

    }

    public static int getValue() {
        return value;
    }

    public static void setValue(int value) {
        PointValue.value = value;
    }

    public static ArrayList<Grid> getPoints() {
        return points;
    }

    public static void setPoints(ArrayList<Grid> points) {
        PointValue.points = points;
    }

    public static ArrayList<Grid> getAddValuePoints() {
        return addValuePoints;
    }

    public static void setAddValuePoints(ArrayList<Grid> addValuePoints) {
        PointValue.addValuePoints = addValuePoints;
    }
}
