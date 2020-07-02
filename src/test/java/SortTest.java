/**
 * Тест класса Sort
 */
public class SortTest {
    public static void testSort() {
        sortTest();
    }
    public static void  sortTest() {
        int[] arr = {0, Integer.MAX_VALUE, Integer.MIN_VALUE, 1, -1, 42, 19, -9, 7, 73};
        int[] arrTest = Sort.reverseSort(arr);
    }

}
