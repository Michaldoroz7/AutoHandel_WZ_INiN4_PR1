package com.AutoHandel.model;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public enum Segment {
    PREMIUM,
    STANDARD,
    BUDGET;

    private static final List<Segment> VALUES = Collections.unmodifiableList(Arrays.asList(values()));
    private static final int SIZE = VALUES.size();
    private static final Random RANDOM = new Random();

    public static Segment randomSegment() {

        return VALUES.get(RANDOM.nextInt(SIZE));
    }
}
