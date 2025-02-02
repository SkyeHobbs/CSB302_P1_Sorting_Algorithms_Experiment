import arraygeneration.GenerateAllArrays;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import sortingalgorithm.*;

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

  @Test
  void testMeasureSortTime_CountingSort() {
    CountingSort countingSort = new CountingSort();

    for (int i = 0; i < testArrays.size(); i++) {
      timer.measureSortTime(testArrays.get(i).getArray(), countingSort::countingSort, "Counting Sort", testArrays.get(i).getArrayType(),testArrays.get(i).getArrayLength());
      Timer.SortData sortData = timer.runtimeData.get(i);

      assertEquals(sortData.getAlgorithm(), "Counting Sort");
      assertEquals(sortData.getArrayType(), testArrays.get(i).getArrayType());
      assertEquals(sortData.getArrayLength(), testArrays.get(i).getArrayLength());
      assertTrue(sortData.runtime >= 0);
    }
    assertFalse(timer.getRuntimeData().isEmpty());
  }

  @Test
  void testMeasureSortTime_HeapSort() {
    HeapSort<Integer> heapSort = new HeapSort<>();

    for (int i = 0; i < testArrays.size(); i++) {
      timer.measureSortTime(testArrays.get(i).getArray(), heapSort::heapSort, "Heap Sort", testArrays.get(i).getArrayType(),testArrays.get(i).getArrayLength());
      Timer.SortData sortData = timer.runtimeData.get(i);

      assertEquals(sortData.getAlgorithm(), "Heap Sort");
      assertEquals(sortData.getArrayType(), testArrays.get(i).getArrayType());
      assertEquals(sortData.getArrayLength(), testArrays.get(i).getArrayLength());
      assertTrue(sortData.runtime >= 0);
    }
    assertFalse(timer.getRuntimeData().isEmpty());
  }

  @Test
  void testMeasureSortTime_InsertionSort() {
    InsertionSort<Integer> insertionSort = new InsertionSort<>();

    for (int i = 0; i < testArrays.size(); i++) {
      timer.measureSortTime(testArrays.get(i).getArray(), insertionSort::insertionSort, "Insertion Sort", testArrays.get(i).getArrayType(),testArrays.get(i).getArrayLength());
      Timer.SortData sortData = timer.runtimeData.get(i);

      assertEquals(sortData.getAlgorithm(), "Insertion Sort");
      assertEquals(sortData.getArrayType(), testArrays.get(i).getArrayType());
      assertEquals(sortData.getArrayLength(), testArrays.get(i).getArrayLength());
      assertTrue(sortData.runtime >= 0);
    }
    assertFalse(timer.getRuntimeData().isEmpty());
  }

  @Test
  void testMeasureSortTime_MergeSort() {
    MergeSort<Integer> mergeSort = new MergeSort<>();

    for (int i = 0; i < testArrays.size(); i++) {
      timer.measureSortTime(testArrays.get(i).getArray(), mergeSort::mergeSort, "Merge Sort", testArrays.get(i).getArrayType(),testArrays.get(i).getArrayLength());
      Timer.SortData sortData = timer.runtimeData.get(i);

      assertEquals(sortData.getAlgorithm(), "Merge Sort");
      assertEquals(sortData.getArrayType(), testArrays.get(i).getArrayType());
      assertEquals(sortData.getArrayLength(), testArrays.get(i).getArrayLength());
      assertTrue(sortData.runtime >= 0);
    }
    assertFalse(timer.getRuntimeData().isEmpty());
  }

  @Test
  void testMeasureSortTime_QuickSort() {
    QuickSort<Integer> quickSort = new QuickSort<>();

    for (int i = 0; i < testArrays.size(); i++) {
      timer.measureSortTime(testArrays.get(i).getArray(), quickSort::quickSortFirstPivot, "Quick Sort", testArrays.get(i).getArrayType(),testArrays.get(i).getArrayLength());
      Timer.SortData sortData = timer.runtimeData.get(i);

      assertEquals(sortData.getAlgorithm(), "Quick Sort");
      assertEquals(sortData.getArrayType(), testArrays.get(i).getArrayType());
      assertEquals(sortData.getArrayLength(), testArrays.get(i).getArrayLength());
      assertTrue(sortData.runtime >= 0);
    }
    assertFalse(timer.getRuntimeData().isEmpty());
  }

  @Test
  void testMeasureSortTime_RadixSort() {
    RadixSort radixSort = new RadixSort();

    for (int i = 0; i < testArrays.size(); i++) {
      timer.measureSortTime(testArrays.get(i).getArray(), radixSort::radixSort, "Radix Sort", testArrays.get(i).getArrayType(),testArrays.get(i).getArrayLength());
      Timer.SortData sortData = timer.runtimeData.get(i);

      assertEquals(sortData.getAlgorithm(), "Radix Sort");
      assertEquals(sortData.getArrayType(), testArrays.get(i).getArrayType());
      assertEquals(sortData.getArrayLength(), testArrays.get(i).getArrayLength());
      assertTrue(sortData.runtime >= 0);
    }
    assertFalse(timer.getRuntimeData().isEmpty());
  }

  @Test
  void testMeasureSortTime_SelectionSort() {
    SelectionSort<Integer> selectionSort = new SelectionSort<>();

    for (int i = 0; i < testArrays.size(); i++) {
      timer.measureSortTime(testArrays.get(i).getArray(), selectionSort::selectionSort, "Selection Sort", testArrays.get(i).getArrayType(),testArrays.get(i).getArrayLength());
      Timer.SortData sortData = timer.runtimeData.get(i);

      assertEquals(sortData.getAlgorithm(), "Selection Sort");
      assertEquals(sortData.getArrayType(), testArrays.get(i).getArrayType());
      assertEquals(sortData.getArrayLength(), testArrays.get(i).getArrayLength());
      assertTrue(sortData.runtime >= 0);
    }
    assertFalse(timer.getRuntimeData().isEmpty());
  }

  @Test
  void testMeasureSortTime_ShellSort() {
    ShellSort<Integer> shellSort = new ShellSort<>();

    for (int i = 0; i < testArrays.size(); i++) {
      timer.measureSortTime(testArrays.get(i).getArray(), shellSort::shellSort, "Shell Sort", testArrays.get(i).getArrayType(),testArrays.get(i).getArrayLength());
      Timer.SortData sortData = timer.runtimeData.get(i);

      assertEquals(sortData.getAlgorithm(), "Shell Sort");
      assertEquals(sortData.getArrayType(), testArrays.get(i).getArrayType());
      assertEquals(sortData.getArrayLength(), testArrays.get(i).getArrayLength());
      assertTrue(sortData.runtime >= 0);
    }
    assertFalse(timer.getRuntimeData().isEmpty());
  }
}
