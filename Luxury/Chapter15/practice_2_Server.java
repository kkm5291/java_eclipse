package Chapter15;
import java.io.*;
import java.util.*;
import java.net.*;
public class practice_2_Server {

	public static void main(String[] args) {
		BufferedReader in = null;
		BufferedWriter out = null;
		Socket socket = null;
		ServerSocket listener = null;
		
		try {
			listener = new ServerSocket(9999);
			System.out.println("타임서버입니다.");
			socket = listener.accept();
			System.out.println("연결되었습니다.");
			System.out.println("500ms마다 수를 보냅니다.");
			
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			
			TimeThread th = new TimeThread(out);
			th.start();
			try {
				th.join(); //스레드 종료 기다림
				System.out.println("종료합니다");
			} catch(InterruptedException e) { }
		} catch(IOException e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				socket.close();
				listener.close();
			} catch(IOException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}

class TimeThread extends Thread {
	private BufferedWriter out;
	public TimeThread(BufferedWriter out) {
		this.out = out;
	}
	
	@Override
	public void run() {
		try {
			for(int i=0; i<20; i++) {
				out.write(i + "\n");
				out.flush();
				Thread.sleep(500);
			}
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
