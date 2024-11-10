package org.adventofcode.day5.v2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.LongStream;

import static org.adventofcode.day5.v2.ExtractFile.extractSourcceDestinationMappingFromFile;

public class ProcessSeeds {
    ArrayList<Long> seeds;
    ArrayList<SourceDestinationMapping> sourceDestinationMappings;
    ArrayList<LocateMapping> soilLocateMappings;
    ArrayList<LocateMapping> fertilizerLocateMappings;
    ArrayList<LocateMapping> waterLocateMappings;
    ArrayList<LocateMapping> lightLocateMappings;
    ArrayList<LocateMapping> temperatureLocateMappings;
    ArrayList<LocateMapping> humidityLocateMappings;
    ArrayList<Long> seedLocations;

    public void runSeedMapping(){
        sourceDestinationMappings = extractSourcceDestinationMappingFromFile();
        mapLocationMappings(sourceDestinationMappings);
    }

    public void mapLocationMappings(ArrayList<SourceDestinationMapping> sourceDestinationMapping){

        sourceDestinationMapping.forEach(this::createLocateMappings);

    }

    public void createLocateMappings(SourceDestinationMapping sdm) {
        System.out.println(sdm.mapCategory());
        switch (sdm.mapCategory()) {
            case "seed-to-soil":
                List<Long> range = LongStream.rangeClosed(0L, sdm.rangeLength()).boxed().toList();
                List<LocateMapping> soilMappings = range.stream().map(index -> createSoilLocateMapping(index, sdm.sourceRangeStart(), sdm.destinationRangeStart())).toList();
                if (soilLocateMappings == null) {
                    soilLocateMappings = new ArrayList<>();
                }
                soilLocateMappings.addAll(soilMappings);
                System.out.println(soilLocateMappings);
            case "soil-to-fertilizer":
                List<Long> fertilizerRange = LongStream.rangeClosed(0L, sdm.rangeLength()).boxed().toList();
                //needs work here
                //List<LocateMapping> fertilizerMappings = fertilizerRange.stream().map(index -> createFertilizerLocateMapping(index, sdm.sourceRangeStart(), sdm.destinationRangeStart())).toList();
                if (fertilizerLocateMappings == null) {
                    fertilizerLocateMappings = new ArrayList<>();
                }
                soilLocateMappings.forEach(p->{});
            case "fertilizer-to-water":
            case "water-to-light":
            case "light-to-temperature":
            case "temperature-to-humidity":
            case "humidity-to-location":

        }

    }
    public LocateMapping createSoilLocateMapping(Long index, Long sourceRange, Long destinationStart){
        Long seed = sourceRange + index;
        Long soil = destinationStart + index;
        return new LocateMapping(seed, soil, soil, soil, soil, soil, soil, soil);
    }



}
