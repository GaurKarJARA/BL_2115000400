import java.util.LinkedList;
import java.util.ListIterator;
public class FindnthElement {

    public static <T> T findNthFromEnd(LinkedList<T> list, int n) {
        if (list == null || n <= 0) {
            throw new IllegalArgumentException("Invalid input");
        }
        ListIterator<T> mainIterator = list.listIterator();
        ListIterator<T> refIterator = list.listIterator();
        
        for (int i = 0; i < n; i++) {
            if (!refIterator.hasNext()) {
                throw new IllegalArgumentException("N is larger than the list size");
            }
            refIterator.next();
        }

        while (refIterator.hasNext()) {
            mainIterator.next();
            refIterator.next();
        }

        return mainIterator.next();
    }

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        int n = 2;
        try {
            String result = findNthFromEnd(list, n);
            System.out.println("The " + n + "th element from the end is: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
