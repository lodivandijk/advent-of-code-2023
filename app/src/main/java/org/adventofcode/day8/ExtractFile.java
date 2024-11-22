package org.adventofcode.day8;

import org.adventofcode.day5.v3.SourceDestinationMapping;
import org.adventofcode.day5.v3.SourceDestinationMappingType;
import org.checkerframework.checker.units.qual.N;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ExtractFile {

    public static String extractNavigationInstructions (){
        String fileName = "/Users/lodivandijk/Library/Mobile Documents/com~apple~CloudDocs/Development/advent-of-code/app/src/main/resources/day8/Day8Data.dat";
        try {
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            String line = br.readLine();
            br.close();
            return line;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static Map<String, String[]> extractNavigationMap() {
        String fileName = "/Users/lodivandijk/Library/Mobile Documents/com~apple~CloudDocs/Development/advent-of-code/app/src/main/resources/day8/Day8Data.dat";
        Map<String, String[]> navigationInstructions = new HashMap<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            br.readLine();
            br.readLine();

            String line;

            while ((line = br.readLine()) != null) {
                line = line.replaceAll("\\s+", " ").replaceAll("=", ",").replace("(", "").replace(")", "").replaceAll("\\s+", "");
                String[] mapData = line.split(",");
                navigationInstructions.put(mapData[0], Arrays.copyOfRange(mapData, 1, mapData.length));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return navigationInstructions;
    }

}
