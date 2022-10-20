package sorting;

import java.util.ArrayList;

public class Sort {

    public static <E> void swap(ArrayList<E> arrayList, int i, int j) {
        E temp = arrayList.get(i);
        arrayList.set(i, arrayList.get(j));
        arrayList.set(j, temp);
    }

    public static <E extends Comparable<E>> void bubbleSort(ArrayList<E> arrayList) {

        for (int i = arrayList.size() - 1; i > 0; i --) {
            for (int j = 0; j < i; j ++) {
                if (arrayList.get(j).compareTo(arrayList.get(j+1)) > 0) {
                    swap(arrayList, i, j);
                }
            }
        }
    }
}