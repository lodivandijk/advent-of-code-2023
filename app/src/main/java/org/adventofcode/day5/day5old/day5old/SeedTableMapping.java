package org.adventofcode.day5.day5old.day5old;

import java.util.ArrayList;

public class SeedTableMapping {
    private ArrayList<Long> seed;
    private ArrayList<Long> soil;
    private ArrayList<Long> fertilizer;
    private ArrayList<Long> water;
    private ArrayList<Long> light;
    private ArrayList<Long> temperature;
    private ArrayList<Long> humidity;
    private ArrayList<Long> location;

    public SeedTableMapping(ArrayList<Long> seed, ArrayList<Long> soil, ArrayList<Long> fertilizer, ArrayList<Long> water, ArrayList<Long> light, ArrayList<Long> temperature, ArrayList<Long> humidity, ArrayList<Long> location) {
        this.seed = seed;
        this.soil = soil;
        this.fertilizer = fertilizer;
        this.water = water;
        this.light = light;
        this.temperature = temperature;
        this.humidity = humidity;
        this.location = location;
    }


    public ArrayList<Long> getSeed() {
        return seed;
    }

    public void setSeed(ArrayList<Long> seed) {
        this.seed = seed;
    }

    public ArrayList<Long> getSoil() {
        return soil;
    }

    public void setSoil(ArrayList<Long> soil) {
        this.soil = soil;
    }

    public ArrayList<Long> getFertilizer() {
        return fertilizer;
    }

    public void setFertilizer(ArrayList<Long> fertilizer) {
        this.fertilizer = fertilizer;
    }

    public ArrayList<Long> getWater() {
        return water;
    }

    public void setWater(ArrayList<Long> water) {
        this.water = water;
    }

    public ArrayList<Long> getLight() {
        return light;
    }

    public void setLight(ArrayList<Long> light) {
        this.light = light;
    }

    public ArrayList<Long> getTemperature() {
        return temperature;
    }

    public void setTemperature(ArrayList<Long> temperature) {
        this.temperature = temperature;
    }

    public ArrayList<Long> getHumidity() {
        return humidity;
    }

    public void setHumidity(ArrayList<Long> humidity) {
        this.humidity = humidity;
    }

    public ArrayList<Long> getLocation() {
        return location;
    }

    public void setLocation(ArrayList<Long> location) {
        this.location = location;
    }
}
