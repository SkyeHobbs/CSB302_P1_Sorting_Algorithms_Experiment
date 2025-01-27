package sortingalgorithm;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

class QuickSortTest {
  @Test
  public void testQuickSort() {

    QuickSort<Integer> quickSort = new QuickSort<>();
    Integer[] array = {34, 7, 23, 32, 5, 62};

    // Test using the first element as the pivot
    Integer[] sortedFirstPivot = quickSort.quickSortFirstPivot(array);
    System.out.println("Sorted with First Pivot: " + Arrays.toString(sortedFirstPivot));

    // Test using a random element as the pivot
    Integer[] sortedRandomPivot = quickSort.quickSortRandomPivot(array);
    System.out.println("Sorted with Random Pivot: " + Arrays.toString(sortedRandomPivot));

    // Test using the median of three elements as the pivot
    Integer[] sortedMedianOfThree = quickSort.quickSortMedianOfThree(array);
    System.out.println("Sorted with Median of Three Pivot: " + Arrays.toString(sortedMedianOfThree));
  }
}