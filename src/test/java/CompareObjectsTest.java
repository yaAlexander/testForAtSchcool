/**
 * Тест класса CompareObjects
 */
public class CompareObjectsTest {
    public static void testCompareObjects() {
        testObjects();
    }

    private static void testObjects() {
        System.out.println("Проверка методов класса CompareObjects");
        System.out.println("Проверка метода compare");

        boolean res = CompareObjects.compare("some string1", "some string2");
        if(res == false) System.out.println("Тест пройден");
        else System.out.println("Тест не пройден");
        res = CompareObjects.compare(1, 2);
        if(res == false) System.out.println("Тест пройден");
        else System.out.println("Тест не пройден");
        res = CompareObjects.compare(6.00, 6.00);
        if(res == true) System.out.println("Тест пройден");
        else System.out.println("Тест не пройден");

        System.out.println("Проверка метода compareToString");

        res = CompareObjects.compareToString(89898.22, 89892.22);
        if(res == false) System.out.println("Тест пройден");
        else System.out.println("Тест не пройден");
        res = CompareObjects.compareToString(420000, 420000);
        if(res == true) System.out.println("Тест пройден");
        else System.out.println("Тест не пройден");
        res = CompareObjects.compareToString(1, "1");
        if(res == true) System.out.println("Тест пройден");
        else System.out.println("Тест не пройден");

        System.out.println("Проверка метода compareHashCode");
        Object ob = 0;
        Object ob1 = new int[]{1, 2, 3};
        Object ob2 =  new int[]{1, 2, 3};
        res = CompareObjects.compareHashCode(ob1, ob2);
        if(res == false) System.out.println("Тест пройден");
        else System.out.println("Тест не пройден");
        res = CompareObjects.compareHashCode(ob, ob);
        if(res == true) System.out.println("Тест пройден");
        else System.out.println("Тест не пройден");

    }


}
