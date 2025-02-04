package arraygeneration;

import java.util.Random;

/**
 * The RandomOrderedArray class generates an array filled with random integers.
 * The generated array can be used for testing sorting algorithms or other operations
 * that require random input.
 */
public class RandomOrderedArray {

  /**
   * Generates an array of random integers of the specified length.
   *
   * <p>The array is filled with integers between 0 (inclusive) and 100 (exclusive).
   *
   * @param length The length of the array to be generated.
   * @return A new array filled with random integers.
   */
  public int[] generateArray(int length) {

    int[] array = new int[length];

    Random random = new Random();

    for (int i = 0; i < length; i++) {
      array[i] = random.nextInt(40001); // Random number between 0 and 40000
    }

    return array;
  }

}

