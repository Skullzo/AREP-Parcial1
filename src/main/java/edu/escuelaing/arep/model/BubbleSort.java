package edu.escuelaing.arep.model;

import java.util.List;

public class BubbleSort {
    public static List<Double> bubblesort(List<Double> arr) {
        int n = arr.size();
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr.get(j) > arr.get(j+1)) {
                    Double temp = arr.get(j);
                    arr.set(j,arr.get(j+1));
                    arr.set(j+1 ,temp);
                }
        return arr;
    }
}
