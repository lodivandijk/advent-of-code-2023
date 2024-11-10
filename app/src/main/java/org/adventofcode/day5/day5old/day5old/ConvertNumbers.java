package org.adventofcode.day5.day5old.day5old;

public class ConvertNumbers {

    private Long destinationNumber;
    private Long sourceNumber;
    private Long rangeNumber;

    public ConvertNumbers(Long destinationNumber, Long sourceNumber, Long rangeNumber) {
        this.destinationNumber = destinationNumber;
        this.sourceNumber = sourceNumber;
        this.rangeNumber = rangeNumber;
    }


    public Long getDestinationNumber() {
        return destinationNumber;
    }

    public void setDestinationNumber(Long destinationNumber) {
        this.destinationNumber = destinationNumber;
    }

    public Long getSourceNumber() {
        return sourceNumber;
    }

    public void setSourceNumber(Long sourceNumber) {
        this.sourceNumber = sourceNumber;
    }

    public Long getRangeNumber() {
        return rangeNumber;
    }

    public void setRangeNumber(Long rangeNumber) {
        this.rangeNumber = rangeNumber;
    }

    @Override
    public String toString() {
        return "convertNumbers{" +
                "destinationNumber=" + destinationNumber +
                ", sourceNumber=" + sourceNumber +
                ", rangeNumber=" + rangeNumber +
                '}';
    }
}
