package org.adventofcode.day5.v3;

import java.util.ArrayList;

public class SourceDestinationMappingType {
    String MappingType;
    ArrayList<SourceDestinationMapping> mappingRange;

    public SourceDestinationMappingType(String mappingType, ArrayList<SourceDestinationMapping> mappingRange) {
        MappingType = mappingType;
        this.mappingRange = mappingRange;
    }


    public String getMappingType() {
        return MappingType;
    }

    public void setMappingType(String mappingType) {
        MappingType = mappingType;
    }

    public ArrayList<SourceDestinationMapping> getMappingRange() {
        return mappingRange;
    }

    public void setMappingRange(ArrayList<SourceDestinationMapping> mappingRange) {
        this.mappingRange = mappingRange;
    }


    @Override
    public String toString() {
        return "SourceDestinationMappingType{\n" +
                "MappingType='" + MappingType + '\n' +
                "mappingRange=" + mappingRange +
                "}\n";
    }
}
