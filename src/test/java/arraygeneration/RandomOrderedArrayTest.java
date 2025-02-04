package arraygeneration;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


/**
 * Unit tests for the RandomOrderedArray class.
 */
public class RandomOrderedArrayTest {

  @Test
  public void testGenerateArray_Length() {
    RandomOrderedArray randomOrderedArray = new RandomOrderedArray();

    int length = 10;
    int[] generatedArray = randomOrderedArray.generateArray(length);

    // Check if the array is not null
    assertNotNull(generatedArray, "Generated array should not be null.");

    // Check if the array has the correct length
    assertEquals(length, generatedArray.length, "Generated array should have the specified length.");
  }

  @Test
  public void testGenerateArray_ValuesInRange() {
    RandomOrderedArray randomOrderedArray = new RandomOrderedArray();

    int length = 8;
    int[] generatedArray = randomOrderedArray.generateArray(length);

    // Check if all values are within the expected range
    for (int value : generatedArray) {
      assertTrue(value >= 0 && value < 40001, "Array values should be between 0 and 40000.");
    }
  }

  @Test
  public void testGenerateArray_EmptyArray() {
    RandomOrderedArray randomOrderedArray = new RandomOrderedArray();

    int[] generatedArray = randomOrderedArray.generateArray(0);

    // Check if the generated array is empty
    assertNotNull(generatedArray, "Generated array should not be null.");
    assertEquals(0, generatedArray.length, "Generated array should have a length of 0.");
  }

  @Test
  public void testGenerateArray_NegativeLength() {
    RandomOrderedArray randomOrderedArray = new RandomOrderedArray();

    // Check for an exception when a negative length is passed
    assertThrows(NegativeArraySizeException.class, () -> randomOrderedArray.generateArray(-5),
            "Negative array lengths should throw NegativeArraySizeException.");
  }
}