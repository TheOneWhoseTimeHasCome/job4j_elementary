package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax5To1Then5() {
        int left = 5;
        int right = 1;
        int result = Max.max(left, right);
        int expected = 5;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax3To3Then3() {
        int left = 3;
        int right = 3;
        int result = Max.max(left, right);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax3To3To3Then3() {
        int one = 3;
        int two = 3;
        int three = 3;
        int result = Max.max(one, two, three);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax1To2To5Then5() {
        int one = 1;
        int two = 2;
        int three = 5;
        int result = Max.max(one, two, three);
        int expected = 5;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax3To3To3To3Then3() {
        int one = 3;
        int two = 3;
        int three = 3;
        int four = 3;
        int result = Max.max(one, two, three, four);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax1To2To3To4Then4() {
        int one = 1;
        int two = 2;
        int three = 3;
        int four = 4;
        int result = Max.max(one, two, three, four);
        int expected = 4;
        assertThat(result).isEqualTo(expected);
    }
}