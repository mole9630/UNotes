package Topic2;

import java.io.*;

public class Main {
    public static String FilePathConversionFileName(String Path) {
        String[] splitPath = Path.split("/");
        return splitPath[splitPath.length - 1];
    }

    public static void main(String[] args) {
        int wordCount = 0;
        int lineCount = 0;
        String filePath = "../example.txt";
        String fileName = FilePathConversionFileName(filePath);

        File file = new File(filePath);

        try {
            String currutLine;
            FileInputStream fis = new FileInputStream(file);
            BufferedReader br = new BufferedReader(new InputStreamReader(fis));

            while ((currutLine = br.readLine()) != null) {
                lineCount++;
                if (!currutLine.trim().isEmpty()) {
                    String[] words = currutLine.split("\\s+");
                    wordCount += words.length;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("文件中共有：" + lineCount + " 行，" + wordCount + " 个单词");

    }
}
