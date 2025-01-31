package sortingalgorithm;

import java.util.Arrays;

/**
 * Merge Sort class. Sorts an integer array.
 */
public class RadixSort {

  /**
   * Sorts the given array by sorting each individual digit of a number.
   *
   * @param array the given array or integers
   * @return int[] the sorted integer array
   */
  public Integer[] radixSort(Integer[] array) {
    // Check if the array is empty or null
    if (array == null || array.length == 0) {
      return array;
    }

    int length = array.length; // Save the array length
    int max = getMax(array, length); // Get the size largest element in the given array

    // Loop through each digit in the given array
    // Sorting each individual digit
    for (int place = 1; place <= max; place *= 10) {
      countSort(array, length, place);
    }
    return array; // Return the sorted array
  }

  /**
   * Helper function to get the maximum value from the given array
   *
   * @param array  the given array or integers
   * @param length the length of the given array
   * @return the maximum value of the given array
   */
  private int getMax(Integer[] array, int length) {
    int max = array[0]; // Set the largest value to the first element

    // Loop through the array and save the largest element
    for (int i = 1; i < length; i++) {
      if (array[i] > max) {
        max = array[i];
      }
    }

    return max; // Return the largest element
  }

  /**
   * A private method that sorts the given array by the digit in the given place
   *
   * @param array  the given array to be sorted
   * @param length the length of the given array
   * @param place  the current place to be sorted i.e. ones, tens, hundreds
   */
  private void countSort(Integer[] array, int length, int place) {
    Integer[] count = new Integer[10]; // Count array to store the frequency of digits
    Integer[] output = new Integer[length]; // Store sorted results
    Arrays.fill(count, 0); // Fill each space with a zeros to prevent errors

    // Store count of each number in its position in the count array
    for (int i = 0; i < length; i++) {
      count[(array[i] / place) % 10]++;
    }

    // Update the count to contain the position of digit in the output array
    for (int i = 1; i < 10; i++) {
      count[i] += count[i - 1];
    }

    // Use the count and original array to build the output array
    for (int i = length - 1; i >= 0; i--) {
      output[count[(array[i] / place) % 10] - 1] = array[i];
      count[(array[i] / place) % 10]--;
    }

    // Copy the output array back to the original array
    System.arraycopy(output, 0, array, 0, length);
  }
}
