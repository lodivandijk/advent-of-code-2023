package org.adventofcode.day18;

import java.util.ArrayList;

public class Main {
    static String filePath = "/Users/lodivandijk/Library/Mobile Documents/com~apple~CloudDocs/Development/advent-of-code/app/src/main/resources/";
    static String fileTestName = "day18/Day18TestData.dat";
    static String fileName = "day18/Day18Data.dat";

    public static void main(String[] args) {
        ArrayList<DigCoordinate> dc = ExtractFile.extractFileData(filePath, fileTestName);
    }
}
