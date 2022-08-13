package charpter2;

public class Zhushi { //类的名称和文件的主文件名要相同
    public static void main(String[] args) {
        int a,b; //定义两个整型变量。*****单行注释 快捷键Ctrl+？

        /*
            也可以使用多行注释
            完成多行注释
            //多行注释中可以嵌套单行注释。
        */
        a = 1;
        b = 2;
        Zhushi zs = new Zhushi();
        zs.show(a,b);
    }
        /**
            文档注释一般用于说明方法或注释等
            方法功能:显示计算结果
            参数含义:xxx
            日期:xxx
            作者:xxx
            ……
         */
        public void show(int a,int b){
            System.out.println(a+b);
        }


}
