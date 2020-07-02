import java.util.Arrays;

/**
 * Тест класса Sort
 */
public class SortTest {
    public static void testSort() {
        reverseSortTest();
    }

    private static void reverseSortTest() {
        int[] test1 = new int[]{Integer.MIN_VALUE, -9, -1, 0, 7, 10, 19, 42, 73, Integer.MAX_VALUE};
        int[] arr = Sort.reverseSort(test1);
        int[] revTest1 = new int[]{Integer.MAX_VALUE, 73, 42, 19, 10, 7, 0, -1, -9, Integer.MIN_VALUE};
        Boolean result = test1.equals(revTest1);
        if (result == false) System.out.println("Тест не прошел");
        else System.out.println("Тест пройден");
    }

}







