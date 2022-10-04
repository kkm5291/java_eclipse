package Chapter15;
import java.io.*;
import java.util.*;
import java.net.*;
public class practice_2_Client {

	public static void main(String[] args) {
		BufferedReader in = null;
		BufferedWriter out = null;
		Socket socket = null;
		
		try {
			socket = new Socket("localhost", 9999);
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			System.out.print("서버의 시간 : ");
			
			int cnt=0;
			while(cnt < 20) {
				String inputMessage = in.readLine();
				System.out.print(inputMessage + " ");
				cnt++;
			}
			System.out.println("\n 연결을 종료합니다.");
			

			
		} catch(IOException e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				if(socket != null) socket.close();
			} catch(IOException e) {
				System.out.println(e.getMessage());
			}
		}
	}

}
