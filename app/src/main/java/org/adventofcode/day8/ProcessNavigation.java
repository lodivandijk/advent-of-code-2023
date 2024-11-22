package org.adventofcode.day8;

import java.util.ArrayList;
import java.util.Map;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ProcessNavigation {
    private static final Logger logger = LoggerFactory.getLogger(ProcessNavigation.class);
    public void processNavigation() {
        Map<String, String[]> navigationMaps = ExtractFile.extractNavigationMap();
        String navigationInstructions = ExtractFile.extractNavigationInstructions();
        logger.info("Navigation Instructions: {}", navigationInstructions);

        navigationMaps.forEach((key, value) -> {
            logger.info("Key: {}, Value({}, {})", key, value[0], value[1]);
        });

        String currentStep = "AAA";
        String[] currentValue;
        int stepCount = 0;
        int index = 0;

        while (!currentStep.equals("ZZZ") && index < navigationInstructions.length()) {
            char currentDirection = navigationInstructions.charAt(index);

            if(currentDirection == 'L'){
                currentStep = navigationMaps.get(currentStep)[0];
                stepCount++;
            }
            if(currentDirection == 'R'){
                currentStep = navigationMaps.get(currentStep)[1];
                stepCount++;
            }
            logger.info("step: {}, currentStep: {}", stepCount, currentStep);
            index++;
        }


    }

}
