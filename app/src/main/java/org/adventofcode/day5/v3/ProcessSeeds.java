package org.adventofcode.day5.v3;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.LongStream;
import java.util.stream.Stream;

import static org.adventofcode.day5.v3.ExtractFile.extractSeedsFromFile;
import static org.adventofcode.day5.v3.ExtractFile.extractSourceDestinationMappingFromFile;

public class ProcessSeeds {

    public void runSeedMapping() {
        ArrayList<Long> seeds;
        ArrayList<SourceDestinationMappingType> sourceDestinationMappingTypes;
        List<Long> destination;

        sourceDestinationMappingTypes = extractSourceDestinationMappingFromFile();
        System.out.println((sourceDestinationMappingTypes));
        seeds = extractSeedsFromFile();
        destination = seeds.stream()
                .flatMap(seed -> sourceDestinationTypeFilter(sourceDestinationMappingTypes, seed))
                .filter(Objects::nonNull).toList();

        System.out.println(destination);
    }

    public Stream<Long> sourceDestinationTypeFilter(ArrayList<SourceDestinationMappingType> sourceDestinationMappingType, Long seed) {
        return sourceDestinationMappingType.stream().map(sdm -> sourceDestinationFilter(sdm, seed)).distinct();
    }

    public Long sourceDestinationFilter(SourceDestinationMappingType sourceDestinationMappings, Long seed){
        Long seedNew = 0L;
            for(int index = 0; index < sourceDestinationMappings.getMappingRange().size(); index++) {
                seedNew = sourceDestinationMapping(seed, sourceDestinationMappings.getMappingRange().get(index));
                if(seedNew != seed){
                    seed = seedNew;
                    break;}
                System.out.println("seed: " + seed + ", index: " + index);
                System.out.println("sdm: " + sourceDestinationMappings.getMappingType() +" range:"+ sourceDestinationMappings.getMappingRange().get(index));

            }

        System.out.println(seed);
            //sourceDestinationTypeFilter(sourceDestinationMappings, seed);
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
