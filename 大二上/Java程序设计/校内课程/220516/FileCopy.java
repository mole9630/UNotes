package com;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class FileCopy {
    public static void main(String[] args) {
        //声明输入输出流 -赋初值null
        FileReader fr = null;
        FileWriter fw = null;

        //创建输入输出流对象
        try {
            //创建File类的对象 -指明输入输出文件 -让文件对象关联到对应文件
            File fi = new File("File.txt"); //相对路径(Idea的项目根目录)
            File fo = new File("C:/Out.txt"); //绝对路径 -注意转义字符(\\表示'\')
            fr = new FileReader(fi); //文件必须存在,否则出现异常
            fw = new FileWriter(fo,true); //如果文件存在,则覆盖,如果不存在,则创建新文件 (false表示内容覆盖,true表示内容追加)

            //数据读写 -对字符 -故做字符数组
            char[] c1 = new char[1024];
            int len = 0; //记录每次读取的字符个数
            while ((len = fr.read(c1)) != -1) //读取到文件末尾 fr.read(c1)从文件中读取数据(字符),返回读取的字符个数,如果读取到文件末尾,返回-1,表示没有读取到数据
            {
//                for (int i=0;i<len;i++) //遍历c1数组 -即fr的文件内容
//                {
//                    System.out.print(c1[i]);
                    fw.write(c1,0,len); //将读取的数据写入到文件中
//                }
//                System.out.println();
            }
        } catch (Exception e){
            System.out.println(e.getMessage());
//            e.printStackTrace();
        } finally {
            //释放资源 -输入输出流与文件断开关联
            try {
                if (fr != null) {
                    fr.close();
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            try {
                if (fw != null) {
                    fw.close();
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
