import javax.swing.plaf.PanelUI;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        task1(nums);
        task2(nums);

        List<String> words = new ArrayList<>(List.of("Smart", "Smart", "Veyron", "Tucson", "Karoq", "Karoq", "Aventador", "Cooper", "Cooper", "Largus"));
        task3(words);

        List<String> strings = new ArrayList<>(List.of("один", "два","два", "три", "три", "три"));
        task4(strings);
    }

    public static void task1(List<Integer> nums) {

        for (Integer num : nums) {
            if (num % 2 == 1) {
                System.out.println(num);
            }
        }
        System.out.println();
    }

    public static void task2(List<Integer> nums) {
        Set<Integer> deleteDoubles= new HashSet<>();

        for (Integer num : nums) {
            if (!deleteDoubles.contains(num)) {
                if (num % 2 == 0) {
                    System.out.println(num);
                    deleteDoubles.add(num);
                }

            }
            
        }
        System.out.println();
    }

    public static void task3(List<String> words) {
        Set<String> deleteDoubleWords = new HashSet<>(words);
        System.out.println(deleteDoubleWords);
    }
    public static void task4(List<String> strings) {

        Map<String, Integer> map = new HashMap<>();

        for (String string : strings) {
            if (map.containsKey(string)) {
                map.put(string, map.get(string) + 1);
            } else {
                map.put(string, 1);
            }
        }
        System.out.println();

        for (String s : map.keySet()) {
            System.out.println(s + " - " + map.get(s));
        }
    }
}