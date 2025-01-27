package arraygeneration;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SeventyFivePercentOrderedArrayTest {

  @Test
  public void seventyFivePercentOrderedArray() {
    SeventyFivePercentOrderedArray arr = new SeventyFivePercentOrderedArray();

    int[] seventyFivePercentOrderedArray = arr.seventyFivePercentOrderedArray(0);
    assertEquals(seventyFivePercentOrderedArray.length, 0);

    seventyFivePercentOrderedArray = arr.seventyFivePercentOrderedArray(10);
    assertEquals(seventyFivePercentOrderedArray.length, 10);

    for (int i = 0; i < ((seventyFivePercentOrderedArray.length / 2) + (seventyFivePercentOrderedArray.length / 4)) - 1; i++) {
      assertTrue(seventyFivePercentOrderedArray[i] <= seventyFivePercentOrderedArray[i + 1]);
    }

    seventyFivePercentOrderedArray = arr.seventyFivePercentOrderedArray(1000);
    assertEquals(seventyFivePercentOrderedArray.length, 1000);

    for (int i = 0; i < ((seventyFivePercentOrderedArray.length / 2) + (seventyFivePercentOrderedArray.length / 4)) - 1; i++) {
      assertTrue(seventyFivePercentOrderedArray[i] <= seventyFivePercentOrderedArray[i + 1]);
    }
  }
}