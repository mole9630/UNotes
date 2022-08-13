package cn;

//import com.Boy; //使用外部包中类的程序中导入类(单类导入:一次只导入一个类)
//import com.Girl; //使用外部包中类的程序中导入类(单类导入:一次只导入一个类)
import com.*; //*为通配符,则意为导入com包下所有的类(按需导入)
import java.util.Scanner; //使用外部包中类的程序中导入类(单类导入:一次只导入一个类)

public class Student {
    Scanner in = new Scanner(System.in);
    Boy b = new Boy();
    Girl g = new Girl();
}
