package org.adventofcode.day5.v2;

public record SourceDestinationMapping (String mapCategory, Long destinationRangeStart, Long sourceRangeStart, Long rangeLength){
    @Override
    public String toString() {
        return "SourceDestinationMapping{" +
                "mapCategory='" + mapCategory + '\'' +
                ", destinationRangeStart=" + destinationRangeStart +
                ", sourceRangeStart=" + sourceRangeStart +
                ", rangeLength=" + rangeLength +
                "}\n";
    }
}
