package com;

import javax.swing.*;
import java.util.Scanner;

public class JFileChooserTest {
    public static void main(String[] args) throws Exception {
        JFileChooser fileChooser = new JFileChooser();
//        if (fileChooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) { //读取对话框
        if (fileChooser.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) { //保存对话框
            java.io.File file = fileChooser.getSelectedFile();
            Scanner input = new Scanner(file);
            while (input.hasNext()) { //读取文件
                System.out.println(input.nextLine());
            }
            input.close();
        }
        else
        {
            System.out.println("No file Selection ");
        }
    }
}
