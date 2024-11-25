package org.adventofcode.day18;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ExtractFile {
    private static final Logger logger = LoggerFactory.getLogger(ExtractFile.class);

    public static ArrayList<DigCoordinate> extractFileData(String filePath, String fileName){
        ArrayList<DigCoordinate> digCoordinates = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(filePath+fileName));
            String line;
            while ((line = br.readLine()) != null) {
                line = line.replaceAll("\\s+", " ").replace("(", "").replace(")", "");
                String[] digData = line.split(" ");
                digCoordinates.add(new DigCoordinate(digData[0].charAt(0), Integer.parseInt(digData[1]), digData[2]));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        logger.info("Dig Coordinates: {}", digCoordinates);
        return digCoordinates;
    }
}
