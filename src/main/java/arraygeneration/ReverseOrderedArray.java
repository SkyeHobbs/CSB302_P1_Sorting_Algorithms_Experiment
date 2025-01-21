package arraygeneration;

import java.util.Arrays;

/**
 * A class which generates an array of integers in descending order.
 */
public class ReverseOrderedArray {

  /**
   * Generates an array of integers in descending order.
   * Uses the RandomOrderedArray class, sorts the numbers, then reverses them.
   *
   * @param length The length of the array to be generated.
   * @return A new array filled with descending ordered integers.
   */
  public int[] generateArray(int length) {
    RandomOrderedArray randomOrderedArray = new RandomOrderedArray();
    int[] array = randomOrderedArray.generateArray(length);

    // Sort array in ascending order.
    // Arrays.sort uses a dual-pivot quicksort, O(n log n).
    Arrays.sort(array);

    // Reverse array.
    // This is done in O(n) time.
    int[] reverseArray = new int[array.length];
    for (int i = 0; i < reverseArray.length; i++) {
      reverseArray[i] = array[array.length - 1 - i];
    }

    return reverseArray;
  }
}
