package org.adventofcode.day3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {
        runData();
    }

    private static void runData() throws IOException {
        getFile();
    }

    private static void getFile() throws IOException {
        String fileName = "/Users/lodivandijk/Library/Mobile Documents/com~apple~CloudDocs/Development/advent-of-code/app/src/main/resources/testData.dat";
        File file = new File(fileName);
        ArrayList<NumberLocation> numberLocations = new ArrayList<>();
        //ArrayList<Grid> gridLocations = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            int y = 0;
            while ((line = br.readLine()) != null) {
                int x = 0;

                while (x < line.length()) {
                    ArrayList<Grid> gridLocations = new ArrayList<>();
                    char character = line.charAt(x);
                    if (Character.isDigit(character)) {
                        StringBuilder number = new StringBuilder();
                        //int startX = x;
                        while (x < line.length() && Character.isDigit(line.charAt(x))) {
                            number.append(line.charAt(x));
                            gridLocations.add(new Grid(x, y));
                            x++;
                        }
                        //System.out.println(number);
                        //System.out.println(gridLocations);

                        numberLocations.add(new NumberLocation(Integer.parseInt(number.toString()), gridLocations));
                        //System.out.println(numberLocations.toString());

                    } else {
                        x++;
                    }

                }
                y++;
            }
        }
        catch (IOException e) {
                e.printStackTrace();
        }



        numberLocations.forEach(p-> System.out.println(p.toString()));

    }
}
