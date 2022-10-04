package e.network;
import java.io.*;
import java.net.*;
import java.util.*;
public class ServerEx {

	public static void main(String[] args) {
		BufferedReader in = null;
		BufferedWriter out = null;
		ServerSocket listener = null;
		Socket socket = null;
		Scanner sc = new Scanner(System.in);
		
		try {
			listener = new ServerSocket(9999);
			System.out.println("연결을 기다리고 있습니다.");
			socket = listener.accept();
			System.out.println("연결됐습니다.");
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			
			while(true) {
				String inputMessage = in.readLine();
				if(inputMessage.equalsIgnoreCase("Bye")) {
					System.out.println("클라이언트에서 종료함");
					break;
				}
				
				System.out.println("클라이언트 : " + inputMessage);
				System.out.print("보내기 >> ");
				String outputMessage = sc.nextLine();
				out.write(outputMessage + "\n");
				out.flush();
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				sc.close();
				socket.close();
				listener.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
