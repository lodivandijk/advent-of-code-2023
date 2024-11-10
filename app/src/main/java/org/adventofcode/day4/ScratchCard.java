package org.adventofcode.day4;

import java.util.ArrayList;
import java.util.Set;

public class ScratchCard {

    private ArrayList<Integer> winningNumbers;
    private ArrayList<Integer> cardNumbers;
    private Integer totalPoints;

    public ScratchCard(ArrayList<Integer> winningNumbers, ArrayList<Integer> cardNumbers, Integer totalPoints) {
        this.winningNumbers = winningNumbers;
        this.cardNumbers = cardNumbers;
        this.totalPoints = totalPoints;
    }

    public ArrayList<Integer> getWinningNumbers() {
        return winningNumbers;
    }

    public void setWinningNumbers(ArrayList<Integer> winningNumbers) {
        this.winningNumbers = winningNumbers;
    }

    public ArrayList<Integer> getCardNumbers() {
        return cardNumbers;
    }

    public void setCardNumbers(ArrayList<Integer> cardNumbers) {
        this.cardNumbers = cardNumbers;
    }

    public Integer getTotalPoints() {
        return totalPoints;
    }

    public void setTotalPoints(Integer totalPoints) {
        this.totalPoints = totalPoints;
    }

    @Override
    public String toString() {
        return "{" +
                "winningNumbers=" + winningNumbers +
                ", cardNumbers=" + cardNumbers +
                ", totalPoints=" + totalPoints +
                "}";
    }

    public void scratchCardPoints() {
        Integer points = 0;
        Integer sumTotalPoints = 0;
        for (Integer num : this.winningNumbers) {
            if (this.cardNumbers.contains(num)) {
                points += 1;
            }
        }
        switch(points) {
            case 1:
                sumTotalPoints = 1;
            case 2:
                sumTotalPoints = 2;
            default:
                sumTotalPoints = (int) Math.pow(2, points - 1);

        }

        this.totalPoints = sumTotalPoints;
    }
}
