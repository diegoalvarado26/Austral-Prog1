package Tp7;

import java.util.Arrays;
import java.util.List;

public class StringList {

    int size;
    String[] items;

    public StringList() {
        size = 10;
        items = new String[10];
    }

    public StringList(int n) {
        size = n;
        items = new String[size];
    }

    public void add(String item) {
        for (int h = 0; h < items.length; h++) {
            if (items[h] == null) {
                items[h] = item;
                break;
            } else {
                String[] items_1 = new String[2 * items.length];
                for (int p = 0; p < items.length; p++) {
                    items_1[p] = items[p];
                }
                items_1[(items.length) + 1] = item;
                items_1 = items;
            }
        }
    }

    public int indexOf(String item) {
        for (int p = 0; p < items.length; p++) {
            if (items[p].equals(item)) {
                return p;
            }

        }
        return -1;
    }

    public void remove(int index) {
        if (index != items.length - 1) {
            for (int j = index; j <= size; j++) {
                items[j] = items[j + 1];
            }
        }
        items[index] = null;
    }

    public String toString() {
        String printear = "{";
        for (int r = 0; (r < (items.length - 1)); r++) {
            printear += (items[r] + ", ");
        }
        printear += items[items.length - 1];
        printear += "}";
        return printear;
    }

    public int size() {
        int counter = 0;
        for (int m = 0; (m < items.length); m++) {
            if (items[m] != null) {
                counter = counter + 1;
            }
        }
        return counter;
    }
}


