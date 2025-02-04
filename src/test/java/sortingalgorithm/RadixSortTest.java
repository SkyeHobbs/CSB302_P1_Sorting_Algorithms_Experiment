package sortingalgorithm;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadixSortTest {
    @Test
    public void radixSort(){
        RadixSort radixSort = new RadixSort();

        Integer[] arr1 = new Integer[0];
        radixSort.radixSort(arr1);

        assertEquals(arr1.length, 0);

        Integer[] arr2 = new Integer[]{150, 40, 5, 106, 89};
        arr2 = radixSort.radixSort(arr2);
        assertEquals(arr2.length, 5);

        for (int i = 0; i < arr2.length - 1; i++) {
            assertTrue(arr2[i] <= arr2[i + 1]);
        }

        Integer[] arr3 = new Integer[4];

        arr3[0] = 60;
        arr3[1] = 2;
        arr3[2] = 60;
        arr3[3] = 400;
        radixSort.radixSort(arr3);

        for (int i = 0; i < arr3.length - 1; i++) {
            assertTrue(arr3[i] <= arr3[i + 1]);
        }
    }
}