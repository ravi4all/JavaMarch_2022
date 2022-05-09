package FileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileReadWrite {
    public static void main(String[] args) throws IOException {
        String path = "D:/file_1.txt";
        String path_2 = "D:/file_2.txt";
        File file = new File(path);
        File file_2 = new File(path_2);
        final int EOF = -1;
        if(file.exists()) {
            FileInputStream fs = new FileInputStream(file);
            FileOutputStream fo = new FileOutputStream(file_2);
            int singleByte = fs.read();
            while(singleByte != EOF) {
                System.out.print((char)singleByte);
                fo.write(singleByte);
                singleByte = fs.read();
            }
            fs.close();
            fo.close();
        }
        
    }
}
