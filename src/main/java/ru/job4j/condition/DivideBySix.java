package ru.job4j.condition;

public class DivideBySix {
    public static String checkNumber(int number) {
        String rsl;
        boolean div2 = number % 2 == 0;
        boolean div3 = number % 3 == 0;
        if (div2 && div3) {
            rsl = "The number divides by 6.";
        } else if (div3) {
            rsl = "The number divides by 3, but it isn't the even number.";
        } else if (div2) {
            rsl = "The number doesn't divide by 3, but it is the even number.";
        } else {
            rsl = "The number doesn't divide by 3 and it isn't the even number.";
        }
        return rsl;
    }
}