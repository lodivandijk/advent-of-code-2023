package org.adventofcode.day18;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;

public class Main {
    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    static String filePath = "/Users/lodivandijk/Library/Mobile Documents/com~apple~CloudDocs/Development/advent-of-code/app/src/main/resources/";
    static String fileTestName = "day18/Day18TestData.dat";
    static String fileName = "day18/Day18Data.dat";

    public static void main(String[] args) {

        ArrayList<DigCoordinate> dc = ExtractFile.extractFileData(filePath, fileTestName);
        ArrayList<MapCoordinate> mc = new ArrayList<>();
        MapCoordinate origin = new MapCoordinate(0, 0);
        int x = 0;
        int y = 0;

        for(int index = 0; index < dc.size(); index++){
            char currentDirection = dc.get(index).direction();
            int distance = dc.get(index).distance();
            switch(currentDirection){
                case 'U':
                    for(int u = 0; u < distance; u++) {
                        y++;
                        mc.add(new MapCoordinate(x, y));
                    }
                    break;
                case 'D':
                    for(int u = 0; u < distance; u++) {
                        y--;
                        mc.add(new MapCoordinate(x, y));
                    }
                    break;
                case 'L':
                    for(int u = 0; u < distance; u++) {
                        x--;
                        mc.add(new MapCoordinate(x, y));
                    }
                    break;
                case 'R':
                    for(int u = 0; u < distance; u++){
                        x++;
                        mc.add(new MapCoordinate(x, y));
                    }
                    break;
            }

        }
        mc.forEach(p-> logger.info(p.toString()));

    }

}
