package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        int indexWord = word.length - 1;
        int indexPost = post.length - 1;
        while (indexPost > -1) {
            if (post[indexPost] != word[indexWord]) {
                result = false;
                break;
            }
            indexWord--;
            indexPost--;
        }
        return result;
    }
}