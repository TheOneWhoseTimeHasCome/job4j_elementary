package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        return left > right ? left : right;
    }

    public static int max(int one, int two, int three) {
        return max(three, max(one, two));
    }

    public static int max(int one, int two, int three, int four) {
        return max(max(three, four), max(one, two));
    }
}