package com.hades.example.android.view_binding_example.dummy;

import java.util.ArrayList;
import java.util.List;

public class DummyItems {
    public static final int COUNT = 50;
    public static final List<DummyItem> ITEMS = new ArrayList<>();
    public static List<DummyItem> ITEMS() {
        if (ITEMS.isEmpty()) {
            ITEMS.addAll(createList(COUNT));
        }
        return ITEMS;
    }

    private static List<DummyItem> createList(int size) {
        List<DummyItem> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add(new DummyItem(i + 1, "Dummy" + (i + 1), i + 1));
        }
        return list;
    }
}
