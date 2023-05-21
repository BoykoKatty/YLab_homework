package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SortSelectedTest {
    @Test
    public void whenSort34125() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort5048259716() {
        int[] data = new int[] {504, 8, 25, 97, 16};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {8, 16, 25, 97, 504};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort852741963() {
        int[] data = new int[] {8, 5, 2, 7, 4, 1, 9, 6, 3};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9};
        assertThat(result).containsExactly(expected);
    }
}