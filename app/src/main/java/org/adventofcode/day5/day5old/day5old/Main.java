package org.adventofcode.day5.day5old.day5old;

public class Main {

    public static void main(String[] args) {

        AlmanacEntry almanacEntry;
        almanacEntry = SoilMapData.getSoilMapData();
        System.out.print(almanacEntry);
        //updateSeedTable(almanacEntry.getSeedMappings(), almanacEntry.getSeedMappings());
    }
}
