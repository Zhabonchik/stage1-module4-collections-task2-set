package com.epam.mjc.collections.set;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class SubsetOfSquaresCreator {
    public Set<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {
        TreeSet<Integer> treeSet = new TreeSet<>(sourceList.stream().map(i -> i * i).collect(Collectors.toSet()));
        return treeSet.subSet(lowerBound, upperBound + 1);
    }
}
