package org.adventofcode.day5.day5old.day5old;

import java.util.ArrayList;

public class CalculateSeedTable {

    public static SeedTableMapping initiateSeedTable(AlmanacEntry almanacEntry) {
        ArrayList<Long> numberRange = new ArrayList<>();

        for (long i = 0; i < almanacEntry.getHighestNumber(); i++) {
            numberRange.add(i);
        }
        return new SeedTableMapping(numberRange, numberRange, numberRange, numberRange, numberRange, numberRange, numberRange, numberRange);
    }

    public static SeedTableMapping updateSeedTable(SeedTableMapping currentSeedTable, SeedMapping seedMapping) {
        switch (seedMapping.getSoilType()) {
            case "seed-to-soil":
                currentSeedTable.setSoil(updateDestination(currentSeedTable.getSoil(), seedMapping.getSeedIndex()));
                System.out.println(currentSeedTable);
            case "soil-to-fertilizer":

                break;
            case "soil-to-water":
                break;
            case "soil-to-light":
                break;
            case "soil-to-temperature":
                break;
            case "soil-to-humidity":
                break;
            case "soil-to-location":
                break;

        }
        return currentSeedTable;
    }

    public static ArrayList<Long> updateDestination(ArrayList<Long> currentSeedTableMapping, ArrayList<ConvertNumbers> seedMapping){
        for (ConvertNumbers convertNumbers : seedMapping) {
            for(Long j = convertNumbers.getSourceNumber(); j < convertNumbers.getSourceNumber() + convertNumbers.getRangeNumber(); j++){
                currentSeedTableMapping.set((Integer.parseInt(j.toString())), convertNumbers.getDestinationNumber());
            }
        }
        return currentSeedTableMapping;
    }
}

