package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet<Integer> hashSet = new HashSet<>();
        for(Integer i : sourceList) {
            hashSet.add(i);
            if (i % 2 == 0) {
                int cpy = i;
                while(cpy % 2 == 0) {
                    hashSet.add(cpy / 2);
                    cpy /= 2;
                }
            } else {
                hashSet.add(i * 2);
            }
        }
        return hashSet;
    }
}
