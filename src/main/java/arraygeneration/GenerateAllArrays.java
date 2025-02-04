package arraygeneration;

import java.util.ArrayList;
import java.util.List;

/**
 * Class responsible for generating arrays of different types with various lengths.
 */
public class GenerateAllArrays<T extends Number>  {
  private static final String[] arrayTypes = {
    "RandomOrderedArray",
    "OrderedArray",
    "ReverseOrderedArray",
    "FiftyPercentOrderedArray",
    "SeventyFivePercentOrderedArray"
  };

  private static final int[] arrayLengths = generateArrayLengths();

  /**
   * Generates all arrays of different types and lengths.
   *
   * @return List of ArrayInfo objects containing the generated arrays.
   */
  public List<ArrayInfo<T>> generateAllArrays() {
    List<ArrayInfo<T>> result = new ArrayList<>();

    // Iterate through all array types
    for (String type : arrayTypes) {
      for (int length : arrayLengths) {
        // Generate array by type and length
        T[] array = generateArrayByType(type, length);
        // Create ArrayInfo object and add to result list
        result.add(new ArrayInfo<>(type, length, array));
      }
    }
    return result;
  }

  /**
   * Helper method to generate arrays based on the type and length.
   *
   * @param type   The type of the array to generate.
   * @param length The length of the array.
   * @return The generated array.
   */
  private T[] generateArrayByType(String type, int length) {
    int[] intArray = switch (type) {
      case "RandomOrderedArray" -> new RandomOrderedArray().generateArray(length);
      case "OrderedArray" -> new OrderedArray().generateArray(length);
      case "ReverseOrderedArray" -> new ReverseOrderedArray().generateArray(length);
      case "FiftyPercentOrderedArray" ->
              new FiftyPercentOrderedArray().fiftyPercentOrderedArray(length);
      case "SeventyFivePercentOrderedArray" ->
              new SeventyFivePercentOrderedArray().seventyFivePercentOrderedArray(length);
      default -> throw new IllegalArgumentException("Unknown array type: " + type);
    };
    // Convert int[] to T[]
    T[] genericArray = (T[]) java.lang.reflect.Array.newInstance(Integer.class, intArray.length);
    for (int i = 0; i < intArray.length; i++) {
      genericArray[i] = (T) Integer.valueOf(intArray[i]); // Cast to T
    }

    return genericArray;
  }

  /**
   * Helper method to generate the array lengths in powers of 2.
   *
   * @return The array of lengths.
   */
  static int[] generateArrayLengths() {
    int[] lengths = new int[14];
    for (int i = 0; i < 14; i++) {
      lengths[i] = (int) Math.pow(2, i + 2);
    }
    return lengths;
  }

  /**
   * Inner class to hold the generated array info.
   */

  public static class ArrayInfo<T extends Number> {
    private String arrayType;   // Array type (e.g., "RandomOrderedArray")
    private int arrayLength;    // Length of the array
    private T[] array;        // The generated array

    /**
     * Constructor to initialize an ArrayInfo object.
     *
     * @param arrayType   The type of the array.
     * @param arrayLength The length of the array.
     * @param array       The generated array.
     */
    public ArrayInfo(String arrayType, int arrayLength, T[] array) {
      this.arrayType = arrayType;
      this.arrayLength = arrayLength;
      this.array = array;
    }

    public String getArrayType() {
      return arrayType;
    }

    public int getArrayLength() {
      return arrayLength;
    }

    public T[]  getArray() {
      return array;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("Array Type: ").append(arrayType).append(", ");
      sb.append("Length: ").append(arrayLength).append(", ");
      sb.append("Array: [");

      int limit = Math.min(array.length, 50); // Limit to first 50 elements
      for (int i = 0; i < limit; i++) {
        sb.append(array[i]);
        if (i < limit - 1) {
          sb.append(", ");
        }
      }

      if (array.length > 50) {
        sb.append(", ..."); // Indicate there are more elements
      }

      sb.append("]");
      return sb.toString();
    }
  }
}

