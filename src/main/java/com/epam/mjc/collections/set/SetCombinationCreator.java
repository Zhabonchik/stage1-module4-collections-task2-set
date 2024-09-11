package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.Set;

public class SetCombinationCreator {
    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {
        Set<String> combination = new HashSet<>(firstSet);
        combination.retainAll(secondSet);
        combination.removeAll(thirdSet);
        thirdSet.removeAll(firstSet);
        thirdSet.removeAll(secondSet);
        combination.addAll(thirdSet);
        return combination;
    }
}
