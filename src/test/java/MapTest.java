import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.sql.SQLOutput;
import java.util.HashMap;

/**
 * Тест класса Map
 */
public class MapTest {
    public static void testMap() {
        System.out.println("\nПроверка методов класса Map");
        testCount();
        testRemove();
    }

    private static void testCount() {
        System.out.println("Проверка методов класса countElementsInMap");
        int res = Map.countElementsInMap("Ерохин", "Сергей");
        if (res == 3) System.out.println("Тест пройден. Ожидаемый результат 3");
        else System.out.println("Тест не пройден. Ожидаемый результат 3 фактический " + res);
        res = Map.countElementsInMap("Андреев ", "Андрей ");
        if (res == 2) System.out.println("Тест пройден. Ожидаемый результат 2");
        else System.out.println("Тест не пройден. Ожидаемый результат 2 фактический " + res);

    }

    private static void testRemove() {
        System.out.println("Проверка методов класса deleteValueFromMap");
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("Дмитров", "Алексей");
        map.put("Ерохин", "Сергей ");
        map.put("Ярмолов", "Алексей");
        map.put("Карасев ", "Дмитрий");
        map.put(" Ерохин", "Сергей");
        map.put("Андреев ", "Андрей ");
        map.put("Смирнов", "Владимир");
        map.put("Ерохин ", "Сергей");
        map.put("Андреев", "Андрей");

        System.out.println("Ерохин ");
        System.out.println(Map.deleteValueFromMap(map, "Ерохин "));
        System.out.println("Владимир");
        System.out.println(Map.deleteValueFromMap(map, "Владимир"));
    }

}
