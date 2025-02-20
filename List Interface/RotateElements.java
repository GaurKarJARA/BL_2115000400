import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class RotateElements {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        int rotateBy = 2;
        rotateList(list, rotateBy);

        System.out.println(list);
    }

    public static void rotateList(List<Integer> list, int rotateBy) {
        Collections.rotate(list, rotateBy);
    }
}
