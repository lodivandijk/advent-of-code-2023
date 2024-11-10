package org.adventofcode.day5.v3;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

import static org.adventofcode.day5.v3.ExtractFile.extractSeedsFromFile;
import static org.adventofcode.day5.v3.ExtractFile.extractSourceDestinationMappingFromFile;

public class ProcessSeeds {

    public void runSeedMapping(){
        ArrayList<Long> seeds;
        ArrayList<SourceDestinationMapping> sourceDestinationMappings;
        List<Long> destination;

        sourceDestinationMappings = extractSourceDestinationMappingFromFile();
        seeds = extractSeedsFromFile();
        destination = seeds.stream()
                .map(seed -> sourceDestinationFilter(sourceDestinationMappings, seed))
                .filter(Objects::nonNull).toList();

        System.out.println(destination);
    }

    public Long sourceDestinationFilter(ArrayList<SourceDestinationMapping> sourceDestinationMappings, Long seed){

        for(int index = 0; index < sourceDestinationMappings.size(); index++) {
            seed = sourceDestinationMapping(seed, sourceDestinationMappings.get(index));
            System.out.println("seed: " + seed + ", index: " + index);
            System.out.println("sdm: " + sourceDestinationMappings.get(index));
        }

        System.out.println(seed);
        return seed;
    }

    public Long sourceDestinationMapping(Long seed, SourceDestinationMapping sourceDestinationMapping){
        List<Long> destinationRange;
        List<Long> sourceRange;

        sourceRange = LongStream.rangeClosed(sourceDestinationMapping.sourceRangeStart(), sourceDestinationMapping.sourceRangeStart() + sourceDestinationMapping.rangeLength())
                .boxed()
                .collect(Collectors.toList());

        destinationRange = LongStream.rangeClosed(sourceDestinationMapping.destinationRangeStart(), sourceDestinationMapping.destinationRangeStart() + sourceDestinationMapping.rangeLength())
                .boxed()
                .collect(Collectors.toList());

        if(sourceRange.contains(seed)){
            int index = sourceRange.indexOf(seed);
            seed = destinationRange.get(index);
        }

        return seed;
    }
}
