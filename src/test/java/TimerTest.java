import arraygeneration.GenerateAllArrays;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import sortingalgorithm.BubbleSort;
import sortingalgorithm.BucketSort;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TimerTest {
  Timer timer;
  GenerateAllArrays<Integer> generateAllArrays;
  List<GenerateAllArrays.ArrayInfo<Integer>> testArrays;

  @BeforeEach
  void setUp() {
    timer = new Timer();
    generateAllArrays = new GenerateAllArrays<>();
    testArrays = generateAllArrays.generateAllArrays();
  }

  @Test
  void testMeasureSortTime_BubbleSort() {
    BubbleSort<Integer> bubbleSort = new BubbleSort<>();
    for (int i = 0; i < testArrays.size(); i++) {
      timer.measureSortTime(testArrays.get(i).getArray(), bubbleSort::bubbleSort, "Bubble Sort", testArrays.get(i).getArrayType(),testArrays.get(i).getArrayLength());
      Timer.SortData sortData = timer.runtimeData.get(i);

      assertEquals(sortData.getAlgorithm(), "Bubble Sort");
      assertEquals(sortData.getArrayType(), testArrays.get(i).getArrayType());
      assertEquals(sortData.getArrayLength(), testArrays.get(i).getArrayLength());
      assertTrue(sortData.runtime >= 0);
    }
    assertFalse(timer.getRuntimeData().isEmpty());
  }

  @Test
  void testMeasureSortTime_BucketSort() {
    BucketSort<Integer> bucketSort = new BucketSort<>();

    for (int i = 0; i < testArrays.size(); i++) {
      timer.measureSortTime(testArrays.get(i).getArray(), bucketSort::bucketSort, "Bucket Sort", testArrays.get(i).getArrayType(),testArrays.get(i).getArrayLength());
      Timer.SortData sortData = timer.runtimeData.get(i);

      assertEquals(sortData.getAlgorithm(), "Bucket Sort");
      assertEquals(sortData.getArrayType(), testArrays.get(i).getArrayType());
      assertEquals(sortData.getArrayLength(), testArrays.get(i).getArrayLength());
      assertTrue(sortData.runtime >= 0);
    }
    assertFalse(timer.getRuntimeData().isEmpty());
  }
}
