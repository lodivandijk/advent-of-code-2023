package org.adventofcode.day5.day5old.day5old;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class SoilMapData {

    public static AlmanacEntry getSoilMapData() {
        //String fileName = "/Users/lodivandijk/Library/Mobile Documents/com~apple~CloudDocs/Development/advent-of-code/app/src/main/resources/day5/Day5TestData.dat";
        String fileName = "../resources/day5/Day5TestData.dat";

        ArrayList<Long> seeds = new ArrayList<>();
        ArrayList<SeedMapping> seedMapping = new ArrayList<>();
        Long highestNumber = 0L;

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            ArrayList<ConvertNumbers> convertNumbers = new ArrayList<>();
            String soilType ="soilType";
            while ((line = br.readLine()) != null) {
                line = line.replaceAll("\\s+", " ");
                String[] seedsData = line.split(" ");

                if (seedsData[0].equals("seeds:")) {
                    for (String seedData : seedsData) {
                        try {
                            seeds.add(Long.parseLong(seedData));
                        } catch (NumberFormatException e) {
                            }
                    }
                } else if (isFirstCharacterDigit(seedsData[0])) {
                    ConvertNumbers convertNumber = new ConvertNumbers(Long.parseLong(seedsData[0]), Long.parseLong(seedsData[1]), Long.parseLong(seedsData[2]));
                    convertNumbers.add(convertNumber);
                    highestNumber = Math.max(highestNumber, Long.parseLong(seedsData[1]) + Long.parseLong(seedsData[2]));
                } else if (isFirstCharacterLetter(seedsData[0])){
                    soilType = seedsData[0];
                }else if (line.isBlank() || line.isEmpty()) {
                    if(soilType.equals("soilType")) {
                    }
                    else {
                        seedMapping.add(new SeedMapping(soilType, convertNumbers));
                        convertNumbers = new ArrayList<>();

                    }
                }
            }

        } catch(IOException ex){
                throw new RuntimeException(ex);
        }
        return new AlmanacEntry(seeds,seedMapping, highestNumber);
    }

    public static boolean isFirstCharacterDigit(String input) {
        if (input == null || input.isEmpty()) {
            return false;
        }
        return Character.isDigit(input.charAt(0));
    }

    public static boolean isFirstCharacterLetter(String input) {
        if (input == null || input.isEmpty()) {
            return false;
        }
        return Character.isLetter(input.charAt(0));
    }
}
