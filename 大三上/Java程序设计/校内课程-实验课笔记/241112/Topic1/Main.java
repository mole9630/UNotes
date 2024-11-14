package Topic1;

import java.io.File;

public class Main {
    public static String FilePathConversionFileName(String Path) {
        String[] splitPath = Path.split("/");
        return splitPath[splitPath.length - 1];
    }

    public static void main(String[] args) {
        String filePath = "../example.txt";
        String fileName = FilePathConversionFileName(filePath);
        File file = new File(filePath);
        System.out.println(fileName + "是否存在：" + file.exists());
        System.out.println(fileName + "是否是文件：" + file.isFile());
        System.out.println(fileName + "最后修改日期：" + file.lastModified());
        System.out.println(fileName + "文件大小：" + file.length());
        System.out.println(fileName + "是否可读：" + file.canRead());
        System.out.println(fileName + "是否可写：" + file.canWrite());
        System.out.println(fileName + "是否可执行：" + file.canExecute());
        System.out.println(fileName + "的绝对路径：" + file.getAbsolutePath());
    }
}
