import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	
	void connect() throws IOException {
		ServerSocket socket = new ServerSocket(1234);
		System.out.println("Waiting for client...");
		Socket s = socket.accept();	// handshaking with client
		System.out.println("Client arrived...");
		DataInputStream di = new DataInputStream(s.getInputStream());
		// Encoding - from string to bytes and Decoding - from bytes to string
		String str = (String)di.readUTF();
		System.out.println("Client Message :: " + str);
		socket.close();
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Server obj = new Server();
		obj.connect();
	}

}
