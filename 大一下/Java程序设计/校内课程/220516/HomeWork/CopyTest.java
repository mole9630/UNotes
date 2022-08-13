package HomeWork;
/**
 * 编写一个程序，实现记事本文件的复制功能。
 * (注意：文件内容为中英文，避免乱码问题)

 @ THIS FILE IS PART OF mole9630 PROJECT
 @ CopyTest.java - This is the java homework for May 17th
 @ THIS PROGRAM IS FREE Code, IS LICENSED UNDER GPL3 License
 @ Copyright (c) 2022 mole9630(Github)
 @ www.mole9630.top | me@mole9630.top
 */
import java.io.*;

public class CopyTest {
    public static void main(String[] args) {
        //声明输入输出字节流 -赋初值null
        FileInputStream originalFile = null; //原文件
        FileOutputStream newFile = null; //操作复制后的新文件
        try {
            //创建File类的对象 -指明输入输出文件 -让文件对象关联到对应文件
            File fi = new File("G:/originalFile.txt");
            File fo = new File("G:/newFile.txt");
            //创建输入输出字节流对象
            originalFile = new FileInputStream(fi); //文件必须存在,否则出现异常
            newFile = new FileOutputStream(fo); //如果文件存在,则覆盖,如果不存在,则创建新文件 (false表示内容覆盖,true表示内容追加)
            //数据读写 -对字节 -故做字节数组
            byte[] c1 = new byte[1024];
            int len = 0; //记录每次读取的字节个数
            while ((len = originalFile.read(c1)) != -1) //读取到文件末尾 originalFile.read(c1)从文件中读取数据(字符),返回读取的字符个数,如果读取到文件末尾,返回-1,表示没有读取到数据
            {
//                for (int i=0;i<len;i++) //遍历c1数组 -即originalFile的文件内容
//                {
//                    System.out.print(c1[i]);
                newFile.write(c1,0,len); //将读取的数据写入到文件中
//                }
//                System.out.println();
            }
        } catch (Exception e){
            System.out.println("复制文件出错,请检查后重试!");
//            e.printStackTrace();
        } finally {
            //释放资源 -输入输出流与文件断开关联
            try {
                if (originalFile != null) {
                    originalFile.close();
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            try {
                if (newFile != null) {
                    newFile.close();
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
