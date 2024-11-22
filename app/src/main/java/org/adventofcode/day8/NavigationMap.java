package org.adventofcode.day8;

import java.util.Map;

public class NavigationMap {
    Map<String, MapNode> navigationMap;

    public NavigationMap(Map<String, MapNode> navigationMap) {
        this.navigationMap = navigationMap;
    }

    public Map<String, MapNode> getNavigationMap() {
        return navigationMap;
    }

    public void setNavigationMap(Map<String, MapNode> navigationMap) {
        this.navigationMap = navigationMap;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("NavigationMap{");
        navigationMap.forEach((key, value) -> sb.append("Key=").append(key).append(" Node=").append(value.toString()));
        sb.append("}");
        return sb.toString();
    }
}
