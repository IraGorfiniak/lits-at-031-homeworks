package first;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class FirstTask {

    public static void main(String[] args) {

        Random random = new Random();
        Set<String> stringSet = new HashSet<>();
        for (int i = 0; i < 5; i++) {
            StringBuilder sb = new StringBuilder();
            int len = random.nextInt(10) + 6;
            while (len-- > 0) {
                char c = (char) (random.nextInt(26) + 'a');
                sb.append(c);
            }
            stringSet.add(sb.toString());

        }
        for (String s : stringSet) {
            System.out.println(s);
        }
    }
}