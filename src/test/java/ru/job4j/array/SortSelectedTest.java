package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SortSelectedTest {
    @Test
    public void whenSortFirst() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSortSecond() {
        int[] data = new int[] {67, 40, 6};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {6, 40, 67};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSortThird() {
        int[] data = new int[] {5, 1, 10, 200, 50};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 5, 10, 50, 200};
        assertThat(result).containsExactly(expected);
    }
}