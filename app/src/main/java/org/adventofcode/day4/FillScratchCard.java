package org.adventofcode.day4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class FillScratchCard {

    public ArrayList<ScratchCard> fillScratchCard() {
        String fileName = "/Users/lodivandijk/Library/Mobile Documents/com~apple~CloudDocs/Development/advent-of-code/app/src/main/resources/day4/Day4Data.dat";
        File file = new File(fileName);
        ArrayList<ScratchCard> scratchCards = new ArrayList<>();
        ArrayList<Integer> scratchCardNumbers = new ArrayList<>();
        ArrayList<Integer> winningNumbers = new ArrayList<>();
        Integer totalPoints = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                line = line.replaceAll("\\s+", " ");
                String[] scratchCardDetails = line.split(" ");
                winningNumbers = convertToArrayList(selectElements(scratchCardDetails, 2, 12));
                scratchCardNumbers = convertToArrayList(selectElements(scratchCardDetails, 13, 38));
                scratchCards.add(new ScratchCard(winningNumbers, scratchCardNumbers, totalPoints));
            }

        } catch(IOException e){
            e.printStackTrace();
        }

        ScratchCard sc = new ScratchCard(winningNumbers, scratchCardNumbers, totalPoints);
        return scratchCards;
    }

    private String[] selectElements(String[] array, int start, int end) {
        return Arrays.copyOfRange(array, start, end);
    }

    public static ArrayList<Integer> convertToArrayList(String[] stringArray) {
        ArrayList<Integer> integerList = new ArrayList<>();
        for (String str : stringArray) {
            try {
                integerList.add(Integer.parseInt(str));
            } catch (NumberFormatException e) {
                // Ignore non-integer strings
            }
        }
        return integerList;
    }

}
