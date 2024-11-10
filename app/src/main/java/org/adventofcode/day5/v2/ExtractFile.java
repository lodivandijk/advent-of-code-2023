package org.adventofcode.day5.v2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ExtractFile {

    public static ArrayList<SourceDestinationMapping> extractSourcceDestinationMappingFromFile() {
        String fileName = "/Users/lodivandijk/Library/Mobile Documents/com~apple~CloudDocs/Development/advent-of-code/app/src/main/resources/day5/Day5TestData.dat";
        ArrayList<SourceDestinationMapping> sourceDestinationMappings = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            String line;

            String mappingType = "mappingType";
            while ((line = br.readLine()) != null) {
                line = line.replaceAll("\\s+", " ");
                String[] seedsData = line.split(" ");

                if (seedsData[0].equals("seeds:")) {
                } else if (isFirstCharacterLetter(seedsData[0])) {
                    mappingType = seedsData[0];
                } else if (isFirstCharacterDigit(seedsData[0])) {
                    sourceDestinationMappings.add(new SourceDestinationMapping(mappingType, Long.parseLong(seedsData[0]), Long.parseLong(seedsData[1]), Long.parseLong(seedsData[2])));
                } else {
                }
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return sourceDestinationMappings;
    }


    public static ArrayList<Long> extractSeedsFromFile(){
        ArrayList<Long> seeds = new ArrayList<>();
        return seeds;
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
