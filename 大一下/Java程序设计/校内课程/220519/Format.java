package com;

import java.io.FileOutputStream;
import java.io.PrintWriter;

public class Format {
    public static void main(String[] args) {
        FileOutputStream fos = null;
        PrintWriter pw = null;

        try {
            fos = new FileOutputStream("Dat.txt");
            pw = new PrintWriter(fos);
            for (int i=0;i<10000;i++)
            {
                if (i%2==0)
                {
                    System.out.print(i);
                    pw.write(i); //输出到文件
                }
                else
                {
                    System.out.println(i);
                    pw.write(i + "\n");
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            if (pw!=null)
            {
                pw.close();
            }
        }
    }
}
