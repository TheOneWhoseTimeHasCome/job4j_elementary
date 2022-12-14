package ru.job4j.array;

public class SortSelected {

    public static int[] sort(int[] data) {
        for (int indStart = 0; indStart < data.length; indStart++) {
            int minNumb = MinDiapason.findMin(data, indStart, data.length - 1);
            int indMin = FindLoop.indexInRange(data, minNumb, indStart, data.length - 1);
            SwitchArray.swap(data, indStart, indMin);
        }
        return data;
    }
}