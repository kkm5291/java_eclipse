package e.network;
import java.io.*;
import java.net.*;
import java.util.*;
public class ClientEx {

	public static void main(String[] args) {
		BufferedReader in = null;
		BufferedWriter out = null;
		Socket socket = null;
		Scanner sc = new Scanner(System.in);
		
		try {
			socket = new Socket("localhost", 9999);
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			
			while(true) {
				System.out.print("보내기 >> ");
				String outputMessage = sc.nextLine();
				if(outputMessage.equalsIgnoreCase("Bye")) {
					break;
				}
				out.write(outputMessage + "\n");
				out.flush();
				String inputMessage = in.readLine();
				System.out.println("서버 : " + inputMessage);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				sc.close();
				socket.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
