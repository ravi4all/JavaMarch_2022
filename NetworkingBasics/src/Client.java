import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {
	
	void connect() throws UnknownHostException, IOException {
		Socket s = new Socket("localhost", 1234);
		System.out.println("Connected with server....");
		DataOutputStream dos = new DataOutputStream(s.getOutputStream());
		// dos.writeUTF("Hello Server");
		Scanner scanner = new Scanner(System.in);
		String message = scanner.nextLine();
		dos.writeUTF(message);
		System.out.println("Message sent...");
		dos.close();
		s.close();
	}

	public static void main(String[] args) throws UnknownHostException, IOException {
		
		Client cli = new Client();
		cli.connect();

	}

}
