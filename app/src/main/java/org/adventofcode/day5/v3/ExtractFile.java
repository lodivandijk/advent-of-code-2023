package org.adventofcode.day5.v3;

import com.google.common.base.MoreObjects;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ExtractFile {

    public static ArrayList<Long> extractSeedsFromFile (){
        String fileName = "/Users/lodivandijk/Library/Mobile Documents/com~apple~CloudDocs/Development/advent-of-code/app/src/main/resources/day5/Day5TestData.dat";
        ArrayList<Long> seeds = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            String line;
            while ((line = br.readLine()) != null) {
                line = line.replaceAll("\\s+", " ");
                String[] seedsData = line.split(" ");
                if (seedsData[0].equals("seeds:")) {
                    for(int i = 1; i < seedsData.length; i++){
                        seeds.add(Long.parseLong(seedsData[i]));
                    }
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return seeds;
    }

    public static ArrayList<SourceDestinationMappingType> extractSourceDestinationMappingFromFile() {
        String fileName = "/Users/lodivandijk/Library/Mobile Documents/com~apple~CloudDocs/Development/advent-of-code/app/src/main/resources/day5/Day5TestData.dat";
        ArrayList<SourceDestinationMapping> sourceDestinationMappings = new ArrayList<>();
        ArrayList<SourceDestinationMappingType> sourceDestinationMappingType = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            String line;

            while ((line = br.readLine()) != null) {
                line = line.replaceAll("\\s+", " ");
                String[] seedsData = line.split(" ");
                String mappingType = "";

                if (seedsData[0].equals("seeds:")) {
                    continue; // Skip seeds line
                } else if (isFirstCharacterLetter(seedsData[0])) {
                    mappingType = seedsData[0];
                    while ((line = br.readLine()) != null && !line.isEmpty() && isFirstCharacterDigit(line.split(" ")[0])) {
                        line = line.replaceAll("\\s+", " ");
                        seedsData = line.split(" ");
                        sourceDestinationMappings.add(new SourceDestinationMapping(Long.parseLong(seedsData[0]), Long.parseLong(seedsData[1]), Long.parseLong(seedsData[2])));
                    }
                    sourceDestinationMappingType.add(new SourceDestinationMappingType(mappingType, new ArrayList<>(sourceDestinationMappings)));
                    sourceDestinationMappings.clear();
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return sourceDestinationMappingType;
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
