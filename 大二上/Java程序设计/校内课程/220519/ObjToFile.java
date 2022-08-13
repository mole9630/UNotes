package com;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjToFile {
    public static void main(String[] args) {
        ObjectOutputStream obj = null;
        FileOutputStream fo = null;

        try{
            fo = new FileOutputStream("Hello.dat");
            obj = new ObjectOutputStream(fo);
            SerializableTest s1 = new SerializableTest("张三","男");
            obj.writeObject(s1);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (obj != null)
                {
                    obj.close();
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

class FileToObj {
    public static void main(String[] args) {
        ObjectInputStream obj = null;
        try{
            obj = new ObjectInputStream(new FileInputStream("Hello.dat"));
            SerializableTest s1 = (SerializableTest) obj.readObject();
            System.out.println(s1.getName() + " " + s1.getSex());
        } catch (Exception e) {
            System.out.println("[Error]" + e.getMessage());
        } finally {
            try {
                if (obj != null)
                {
                    obj.close();
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}