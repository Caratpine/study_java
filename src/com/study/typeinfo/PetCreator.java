package com.study.typeinfo;

import java.util.*;

public abstract class PetCreator {
    private Random rand = new Random(47);

    public abstract List<Class<? extends Pet>> types();

    public void randomPet() {
        int n = rand.nextInt(types().size());

    }
}
