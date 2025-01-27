package arraygeneration;

import java.util.Arrays;

/**
 * Fifty Percent Ordered Array Class. For an integer array
 */
public class FiftyPercentOrderedArray {
  /**
   * This method creates an integer array from the given
   * size of random integer values. Then sorts the first half
   * of the array in ascending order before returning the whole array.
   *
   * @param length the size of the array.
   * @return int[] an array of integers that is fifty percent sorted
   */
  public int[] fiftyPercentOrderedArray(int length) {
    // Check if the given length is 0
    if (length <= 0) {
      return new int[0];
    } else {
      RandomOrderedArray arr = new RandomOrderedArray();

      // Create an array from the given length of random integer values
      int[] result = arr.generateArray(length);
      int mid = length / 2;

      // Sort the first half of the array
      Arrays.sort(result, 0, mid);

      return result; // Return the fifty percent sorted array
    }
  }
}
