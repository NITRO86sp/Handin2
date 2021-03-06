package com.groupC.src;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileReader {
    public String[] ReadFile(String path) throws IOException {
        File file = new File(path);
        FileInputStream fis = new FileInputStream(file);
        byte[] data = new byte[(int) file.length()];
        fis.read(data);
        fis.close();
        String fileString = new String(data, "UTF-8");
        return fileString.split("\n");
    }
}
