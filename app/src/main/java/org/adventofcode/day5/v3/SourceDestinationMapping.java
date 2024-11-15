package org.adventofcode.day5.v3;

public record SourceDestinationMapping(Long destinationRangeStart, Long sourceRangeStart, Long rangeLength){
    @Override
    public String toString() {
        return "SourceDestinationMapping{" +
                "destinationRangeStart=" + destinationRangeStart +
                ", sourceRangeStart=" + sourceRangeStart +
                ", rangeLength=" + rangeLength +
                "}";
    }
}
