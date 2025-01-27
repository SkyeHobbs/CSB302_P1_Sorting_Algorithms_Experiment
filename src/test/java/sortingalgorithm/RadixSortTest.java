package sortingalgorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadixSortTest {
    @Test
    public void radixSort(){
        RadixSort radixSort = new RadixSort();

        int[] arr1 = new int[0];
        radixSort.radixSort(arr1);

        assertEquals(arr1.length, 0);

        int[] arr2 = new int[]{150, 40, 5, 106, 89};
        radixSort.radixSort(arr2);
        assertEquals(arr2.length, 5);

        for (int i = 0; i < arr2.length - 1; i++) {
            assertTrue(arr2[i] <= arr2[i + 1]);
        }

        int[] arr3 = new int[5];

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