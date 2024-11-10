package org.adventofcode.day4;

import java.io.IOException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {
        ArrayList<ScratchCard> scratchCards;

        FillScratchCard sc = new FillScratchCard();
        scratchCards = sc.fillScratchCard();
        scratchCards.forEach(ScratchCard::scratchCardPoints);
        scratchCards.forEach(System.out::println);
        System.out.println(sumScratchCardPoints(scratchCards));
    }

    private static int sumScratchCardPoints(ArrayList<ScratchCard> scratchCards) {
        int totalPoints = 0;
        for (ScratchCard card : scratchCards) {
            totalPoints += card.getTotalPoints();
        }
        return totalPoints;
    }
}
