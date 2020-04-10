package CoreJava.inetAddress;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;



public class EchoServer {

	public static void main(String[] args) throws IOException {
		try (ServerSocket s = new ServerSocket(8189)) {
			try (Socket incoming = s.accept()) {
				InputStream inStream = incoming.getInputStream();
				OutputStream outputStream = incoming.getOutputStream();
				
				try ( Scanner in = new Scanner(inStream, "UTF-8")) {
					PrintWriter out = new PrintWriter(
							new OutputStreamWriter(outputStream, "UTF-8"),
							true);
					
					out.println("Hello! Enter BYE to exit");
					
					boolean done = false;
					while (!done && in.hasNextLine()) {
						String line = in.nextLine();
						out.println("Echo: "+ line);
						if (line.trim().equals("BYE"))
							done = true;
					}
				}
			}
		}
	}

}
