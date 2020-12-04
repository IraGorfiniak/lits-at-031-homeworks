import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SecondTask {
    public static void main(String[] args) {
        Integer[] initialArray = {1, 2, 3, 3, 4, 5, 6, 3, 7, 8, 3, 9};
        System.out.println("Original Array:" + Arrays.toString(initialArray));
        System.out.println("Array in reverse order: ");
        int lastIndex = initialArray.length - 1;
        for (int i = 0; i < initialArray.length; i++)
            System.out.print(initialArray[lastIndex - i] + "  ");

        {
            Set<Integer> set = new HashSet<>(Arrays.asList(initialArray));

            System.out.println("Updated Array" + set);

        }
    }
}
