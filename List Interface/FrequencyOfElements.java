import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FrequencyOfElements {

    public static Map<String, Integer> countFrequency(List<String> elements) {
        Map<String, Integer> frequencyMap = new HashMap<>();
        for (String element : elements) {
            frequencyMap.put(element, frequencyMap.getOrDefault(element, 0) + 1);
        }
        return frequencyMap;
    }

    public static void main(String[] args) {
        List<String> elements = List.of("apple", "banana", "apple", "orange");
        Map<String, Integer> frequency = countFrequency(elements);
        System.out.println(frequency);
    }
}
