package org.adventofcode.day8;

public class MapNode {
    String leftValue;
    String rightValue;


    public MapNode(String leftValue, String rightValue) {
        this.leftValue = leftValue;
        this.rightValue = rightValue;
    }


    public String getLeftValue() {
        return leftValue;
    }

    public void setLeftValue(String leftValue) {
        this.leftValue = leftValue;
    }

    public String getRightValue() {
        return rightValue;
    }

    public void setRightValue(String rightValue) {
        this.rightValue = rightValue;
    }

    @Override
    public String toString() {
        return "MapNode{" +
                "leftValue='" + leftValue + '\'' +
                ", rightValue='" + rightValue + '\'' +
                '}';
    }
}
