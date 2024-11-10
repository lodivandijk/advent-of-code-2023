package org.adventofcode.day5.day5old.day5old;

import java.util.ArrayList;

public class AlmanacEntry {
    private ArrayList<Long> seeds;
    private ArrayList<SeedMapping> seedMappings;
    private Long highestNumber;


    public AlmanacEntry(ArrayList<Long> seeds, ArrayList<SeedMapping> seedMappings, Long highestNumber){
        this.seeds = seeds;
        this.seedMappings = seedMappings;
        this.highestNumber = highestNumber;
    }

    public ArrayList<Long> getSeeds() {
        return seeds;
    }

    public void setSeeds(ArrayList<Long> seeds) {
        this.seeds = seeds;
    }

    public ArrayList<SeedMapping> getSeedMappings() {
        return seedMappings;
    }

    public void setSeedMappings(ArrayList<SeedMapping> seedMappings) {
        this.seedMappings = seedMappings;
    }

    public Long getHighestNumber() {
        return highestNumber;
    }

    public void setHighestNumber(Long highestNumber) {
        this.highestNumber = highestNumber;
    }

    @Override
    public String toString() {
        return "AlmanacEntry{" +
                "seeds=" + seeds +
                ", seedMappings=" + seedMappings +
                ", highestNumber=" + highestNumber +
                '}';
    }
}
