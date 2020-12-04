import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FirstTask {
    public static void main(String[] args) {
        List<Integer> firstList = new ArrayList<>();
        firstList.addAll(Arrays.asList(1, 2, 3, 1, 4, 5, 6, 1, 7, 8, 9, 10));
        System.out.println("Original List:" + firstList);

        int size = firstList.size();
        for (int i = 0; i < size / 2; i++) {
            if ((firstList.get(i)).equals(1)) {
                firstList.set(i, 9);
            }
        }
        System.out.println("Updated List" + firstList);
    }
}
