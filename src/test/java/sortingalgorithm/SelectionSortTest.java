package sortingalgorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SelectionSortTest {
  private ArrayList<Integer> array1;
  private ArrayList<String> array2;

  @BeforeEach
  void setUp() {
    array1 = new ArrayList<>(Arrays.asList(37, 99, 2, 56, 44, 12, 17));
    array2 = new ArrayList<>(Arrays.asList("apples", "oranges", "blueberries"));

  }

  @Test
  void TestSelectionSort() {
    ArrayList<Integer> expected1 = new ArrayList<>(Arrays.asList(2, 12, 17, 37, 44, 56, 99));
    ArrayList<String> expected2 = new ArrayList<>(Arrays.asList("apples", "blueberries", "oranges"));

    SelectionSort.selectionSort(array1);
    SelectionSort.selectionSort(array2);

    assertEquals(expected1, array1);
    assertEquals(expected2, array2);
  }
}