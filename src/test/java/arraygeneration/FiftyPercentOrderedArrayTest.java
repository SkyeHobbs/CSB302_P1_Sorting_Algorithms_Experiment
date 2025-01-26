package arraygeneration;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


class FiftyPercentOrderedArrayTest {
  @Test
  public void fiftyPercentOrderedArray() {
    FiftyPercentOrderedArray arr = new FiftyPercentOrderedArray();

    int[] fiftyPercentOrderedArray = arr.fiftyPercentOrderedArray(0);
    assertEquals(fiftyPercentOrderedArray.length, 0);

    fiftyPercentOrderedArray = arr.fiftyPercentOrderedArray(10);
    assertEquals(fiftyPercentOrderedArray.length, 10);

    for (int i = 0; i < (fiftyPercentOrderedArray.length / 2) - 1; i++) {
      assertTrue(fiftyPercentOrderedArray[i] <= fiftyPercentOrderedArray[i + 1]);
    }

    fiftyPercentOrderedArray = arr.fiftyPercentOrderedArray(1000);
    assertEquals(fiftyPercentOrderedArray.length, 1000);

    for (int i = 0; i < (fiftyPercentOrderedArray.length / 2) - 1; i++) {
      assertTrue(fiftyPercentOrderedArray[i] <= fiftyPercentOrderedArray[i + 1]);
    }
  }

}