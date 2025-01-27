package arraygeneration;

import java.util.Arrays;

/**
 * Fifty Percent Ordered Array Class. For an integer array
 */
public class SeventyFivePercentOrderedArray {
  /**
   * This method creates an integer array from the given
   * size of random integer values. Then sorts the first seventy-five
   * of the array in ascending order before returning the whole array.
   *
   * @param length the size of the array.
   * @return int[] an array of integers that is seventy-five percent sorted
   */
  public int[] seventyFivePercentOrderedArray(int length) {
    // Check if the given length is 0
    if (length <= 0) {
      return new int[0];
    } else {
      RandomOrderedArray arr = new RandomOrderedArray();

      // Create an array from the given length of random integer values
      int[] result = arr.generateArray(length);
      int seventyPercent = (length / 2) + (length / 4);

      // Sort the first seventy-five percent of the array
      Arrays.sort(result, 0, seventyPercent);

      return result; // Return the seventy-five percent sorted array
    }
  }
}
