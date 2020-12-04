import java.util.Arrays;
import java.util.stream.IntStream;
public class ThirdTask {
    public static void main(String[] args) {
        int[] initialArray = {10, 1, 3, 1, 5, 6, 1, 1, 8, 9};
        System.out.println("Array before update:"+Arrays.toString(initialArray));

        int sum = IntStream.of(initialArray).sum();

        int minIndex = 0;
        int minElement = initialArray[minIndex];
        int average = sum / initialArray.length;
        for (int j = 0; j < initialArray.length; j++) {

            if (initialArray[j] <= initialArray[minIndex]) {
                minElement = initialArray[j];
                minIndex = j;
            }
        }

        System.out.println("Average value of the array elements is : " + average);

        System.out.println("minElement:" + minElement + "," + "minIndex:" + minIndex);

        initialArray[minIndex] = average;

        System.out.println("Updated Array:" + Arrays.toString(initialArray));
    }
}