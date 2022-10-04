package e.network;
import java.io.*;
import java.net.*;
import java.util.*;
public class SocketClientSample {
	
	public static void main(String[] args) {
		SocketClientSample sample = new SocketClientSample();
		sample.sendSocketSample();
		
	}
	
	public void sendSocketSample() {
		for(int loop=0; loop<3;loop++) {
			sendAndReceiveSocketData();
		}
	}
	
	public void sendSocketData(String data) {
		Socket socket = null;
		try {
			System.out.println("Client:Connecting");
			socket = new Socket("127.0.0.1", 9999);
			System.out.println("Client:Connect status = " + socket.isConnected());
			Thread.sleep(1);
			OutputStream stream = socket.getOutputStream();
			BufferedOutputStream out = new BufferedOutputStream(stream); //버퍼에 담았음
			byte[] bytes = data.getBytes();
			out.write(bytes); // 버퍼에 옮김
			System.out.println("Client : Sent data");
			out.close(); // 버퍼닫음
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(socket!=null) {
				try {
					socket.close();
				} catch(Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	public void sendAndReceiveSocketData() {
		Socket socket = null;
		try {
			System.out.println("Client:Connecting");
			socket = new Socket("127.0.0.1", 9999);
			System.out.println("Client:Connect status = " + socket.isConnected());
			Thread.sleep(1000);
			byte[] readByte = new byte[256];
			InputStream stream = socket.getInputStream();
			BufferedInputStream in = new BufferedInputStream(stream); //버퍼에 담았음
			in.read(readByte);
			System.out.println("Client : Recieved data = " + new String(readByte).trim());
			
			in.close(); // 버퍼닫음
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(socket!=null) {
				try {
					socket.close();
				} catch(Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
}
