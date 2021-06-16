package com.company;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public static void main(String[] args) {
        List<Integer> collection = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            collection.add(ThreadLocalRandom.current().nextInt(1, 11));
        }
        System.out.println("До удаления повторов: " + collection);

        Set<Integer> newCollection = new LinkedHashSet<>(collection);

        collection.clear();
        collection.addAll(newCollection);
        System.out.println("После удаления повторов: " + collection);
    }
}