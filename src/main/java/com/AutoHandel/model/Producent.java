package com.AutoHandel.model;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public enum Producent {

    TOYOTA,
    BMW,
    NISSAN,
    AUDI,
    OPEL,
    MERCEDES;

    private static final List<Producent> VALUES = Collections.unmodifiableList(Arrays.asList(values()));
    private static final int SIZE = VALUES.size();
    private static final Random RANDOM = new Random();

    public static Producent randomProducent() {

        return VALUES.get(RANDOM.nextInt(SIZE));
    }
}
