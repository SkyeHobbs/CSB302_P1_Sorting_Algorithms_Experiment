package arraygeneration;

import java.util.Arrays;

/**
 * A class which generates an array of integers in ascending order.
 */
public class OrderedArray {

  /**
   * Generates an array of integers in ascending order.
   * Uses the RandomOrderedArray class, then sorts the numbers.
   *
   * @param length The length of the array to be generated.
   * @return A new array filled with ascending ordered integers.
   */
  public int[] generateArray(int length) {
    RandomOrderedArray randomOrderedArray = new RandomOrderedArray();
    int[] array = randomOrderedArray.generateArray(length);

    // Sort array in ascending order.
    // Arrays.sort uses a dual-pivot quicksort, O(n log n).
    Arrays.sort(array);

    return array;
  }
}
