package ExceptionHandling;

import java.io.File;
import java.io.IOException;

public class ExceptionDemo_2 {
    public static void main(String[] args) {
        try {
            String path = "D:/Batches/2022/JavaMarch_2022-main/file_3.txt";
            File file = new File(path);
            if(file.exists()) {
                System.out.println("File Already Exists...");
            }
            else {
                // Checked Exception - checked at compile time
                file.createNewFile();
                System.out.println("New File Created...");
            }
        }
        catch(IOException e) {
            System.out.println("File cannot be created...Invalid Path");
        }
    }
}
