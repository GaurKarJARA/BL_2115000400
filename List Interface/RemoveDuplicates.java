import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
public class RemoveDuplicates {
    public static void main(String[] args) {
        List<Integer> List = new ArrayList<>();
        List.add(3);
        List.add(1);
        List.add(2);
        List.add(2);
        List.add(3);
        List.add(4);
        
        List<Integer> resultList = removeDuplicates(List);
        System.out.println(resultList);
    }
    public static List<Integer> removeDuplicates(List<Integer> list) {
        return new ArrayList<>(new LinkedHashSet<>(list));
    }
}
