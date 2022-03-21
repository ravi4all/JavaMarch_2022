import java.io.IOException;

public class TakingInput {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter your name : ");
        int ch = System.in.read();  // reads one byte at a time
        // it returns the ASCII of character
        System.out.println(ch);
    }
}
