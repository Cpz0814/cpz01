package com.cpz.Demo18;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;

public class DemoThrows {
    public static void main(String[] args) throws IOException {
        read("adwadwa");
    }
    public static void read(String filename) throws IOException {
        if (!filename.equals("c:\\a.txt")){
            throw new FileAlreadyExistsException("传递的路径不是c:\\a.txt");
        }
        System.out.println("路径没有问题");
    }
}
