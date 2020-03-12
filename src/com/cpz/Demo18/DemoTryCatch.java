package com.cpz.Demo18;

import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;

public class DemoTryCatch {
    public static void main(String[] args) {
        try {
            //可能会产生异常的代码
            redFile("a.txt");
        } catch (IOException e) {
            //异常的处理逻辑
            e.printStackTrace();
        }finally {
            System.out.println("资源释放");
        }
    }

    public static void redFile(String filename)throws IOException{
        if (!filename.endsWith(".txt")){
            throw new IOException("传递的路径不是c:\\a.txt");
        }
        System.out.println("正在读取文件。。。");
    }
}
