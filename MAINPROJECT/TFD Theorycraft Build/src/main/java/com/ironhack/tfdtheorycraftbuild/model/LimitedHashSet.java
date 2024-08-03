package com.ironhack.tfdtheorycraftbuild.model;

import java.util.HashSet;
import java.util.Set;

public class LimitedHashSet<T> extends HashSet<T> {
    private final int maxSize;

    public LimitedHashSet(int maxSize) {
        this.maxSize = maxSize;
    }

    @Override
    public boolean add(T element) {
        if (size() >= maxSize) {
            return false; // Reject the addition if the set is already at maximum size
        }
        return super.add(element);
    }
}
