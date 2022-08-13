package com;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class BufferFileCopy {
    public static void main(String[] args) {
        FileReader fr = null;
        FileWriter fw = null;
        BufferedReader br = null;
        BufferedWriter bw = null;

        try {
            //创建对象
            fr = new FileReader("Hello.txt");
            fw = new FileWriter("Out.txt");
            br = new BufferedReader(fr);
            bw = new BufferedWriter(fw);

            //读写
            long start = System.currentTimeMillis();
            //读数据
            String dat;
            while ((dat = br.readLine()) != null)
            {
                bw.write(dat + "\n");
            }

            long end = System.currentTimeMillis();
            System.out.println(end-start); //执行代码的时间差

            //读写
            long start2 = System.currentTimeMillis();
            //读数据
            String dat2;
            while ((dat2 = br.readLine()) != null)
            {
                bw.write(dat2 + "\n");
            }

            long end2 = System.currentTimeMillis();
            System.out.println(end2-start2); //执行代码的时间差
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (bw != null)
                {
                    bw.close();
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
