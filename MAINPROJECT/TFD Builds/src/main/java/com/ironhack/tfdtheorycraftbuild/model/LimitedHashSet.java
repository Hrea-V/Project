package com.ironhack.tfdtheorycraftbuild.model;

import java.util.HashSet;

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