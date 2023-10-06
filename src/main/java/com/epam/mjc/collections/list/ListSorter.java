package com.epam.mjc.collections.list;

import java.util.Comparator;
import java.util.List;

public class ListSorter {
    public void sort(List<String> sourceList) {
        ListComparator listComparator = new ListComparator();
        sourceList.sort(listComparator);
    }
}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        int numberA = Integer.parseInt(a);
        int numberB = Integer.parseInt(b);
        if (numberA * numberA == numberB * numberB) {
            return numberA - numberB;
        } else {
            return (numberA * numberA - numberB * numberB);
        }
    }
}
