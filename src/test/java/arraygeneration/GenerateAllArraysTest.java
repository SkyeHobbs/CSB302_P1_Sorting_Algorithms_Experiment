package arraygeneration;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GenerateAllArraysTest {
  private GenerateAllArrays<Integer> generator;

  @BeforeEach
  void setUp() {
    generator = new GenerateAllArrays<>();
  }

  @Test
  public void testGenerateAllArrays_Size() {
    // Generate arrays and check if the size is as expected
    List<GenerateAllArrays.ArrayInfo<Integer>> arrays = generator.generateAllArrays();

    // Check that the size matches the expected number of arrays (5 types * 14 lengths)
    assertEquals(5 * 14, arrays.size(), "The total number of generated arrays should be 70.");
  }

  @Test
  public void testArrayInfo_Content() {
    // Test the content of an individual ArrayInfo object
    List<GenerateAllArrays.ArrayInfo<Integer>> arrays = generator.generateAllArrays();
    GenerateAllArrays.ArrayInfo<Integer> arrayInfo = arrays.getFirst(); // Get the first array

    // Check the array type is not null or empty
    assertNotNull(arrayInfo.getArrayType(), "Array type should not be null.");
    assertFalse(arrayInfo.getArrayType().isEmpty(), "Array type should not be empty.");

    // Check the array length
    assertTrue(arrayInfo.getArrayLength() > 0, "Array length should be greater than zero.");

    // Check that the array is not null and has the expected length
    assertNotNull(arrayInfo.getArray(), "Array should not be null.");
    assertEquals(arrayInfo.getArrayLength(), arrayInfo.getArray().length, "Array length does not match the expected length.");
  }


  @Test
  public void testGenerateArrayLengths() {
    // Ensure the array lengths are generated correctly (from 2^2 to 2^15)
    int[] lengths = GenerateAllArrays.generateArrayLengths();

    // Check that the correct number of lengths is generated
    assertEquals(14, lengths.length, "There should be 14 different lengths.");

    // Verify the values of the lengths are powers of 2 from 2^2 to 2^15
    for (int i = 0; i < lengths.length; i++) {
      int expectedLength = (int) Math.pow(2, i + 2);
      assertEquals(expectedLength, lengths[i], "Array length is incorrect at index " + i);
    }
  }
}