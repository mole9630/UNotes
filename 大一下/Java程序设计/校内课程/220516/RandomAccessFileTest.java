package com;

import java.io.File;
import java.io.RandomAccessFile;

public class RandomAccessFileTest {
    public static void main(String[] args) {
        try {
            //创建RandomAccessFile对象
            RandomAccessFile raf = new RandomAccessFile("File.txt", "rw");
            //定位指针,下标从3开始
            raf.seek(3);
            //保存指针在文件的第三个字节后面的所有数据
            StringBuilder sb = new StringBuilder((int) (new File("File.txt").length()));
            byte[] b = new byte[1024];
            int len = 0;
            while ((len = raf.read(b)) != -1) {
                sb.append(new String(b, 0, len));
            }
            //遍历byte数组
            for (int i=0;i<sb.length();i++) {
                System.out.print(sb.charAt(i));
                raf.write(sb.charAt(i)); //写
            }
            raf.seek(10);
            raf.write("mole9630".getBytes());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
