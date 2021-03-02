package third;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Third {
    final static String filePath = "homework3/src/main/java/third/Scientists";
    final static String outputFilePath = "homework3/src/main/java/third/FavouriteScientists";
    private static HashMap<Integer, String> mapFile = new HashMap<>();

    public static void main(String[] args) {
        Map<Integer, String> mapRead = getHashMapFromTextFile();
        writeHashMapToTextFile(mapFile);
        for (Map.Entry<Integer, String> entry : mapRead.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
    }

    private static boolean isPowerOfTwo(int number) {

        return number > 0 && ((number & (number - 1)) == 0);

    }

    private static Map<Integer, String> getHashMapFromTextFile() {

        LineNumberReader readLinesFromFile;
        try {
            File scientists = new File(filePath);
            readLinesFromFile = new LineNumberReader(new FileReader(scientists));
            String line;
            int i;
            while ((line = readLinesFromFile.readLine()) != null) {
                i = readLinesFromFile.getLineNumber();
                System.out.print(i + " ");
                System.out.println(line);
                mapFile.put(i, line);

            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return mapFile;

    }

    public static void writeHashMapToTextFile(HashMap<Integer, String> mapNew) {

        File outputFile = new File(outputFilePath);
        BufferedWriter bw = null;

        try {
            bw = new BufferedWriter(new FileWriter(outputFile));

            for (HashMap.Entry<Integer, String> entry :
                    mapNew.entrySet()) {
                int number = entry.getKey();

                if (isPowerOfTwo(number)) {
                    bw.write(entry.getKey() + ":" + entry.getValue());
                    bw.newLine();

                }

            }

            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            try {
                bw.close();
            } catch (Exception e) {
            }
        }

    }


}

