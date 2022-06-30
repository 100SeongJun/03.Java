package step02.tcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static void main(String[] args) {
		ServerSocket serverSocket = null;

		try {
			serverSocket = new ServerSocket();
			serverSocket.bind(new InetSocketAddress("localhost", 8888));
			while (true) {
				// 1단계: 연결
				System.out.println("연결 대기중");
				Socket socket = serverSocket.accept();
				InetSocketAddress inetSocketAddr = (InetSocketAddress) socket.getRemoteSocketAddress();
				System.out.println(inetSocketAddr.getHostName() + "님이 연결되었습니다.");

				// 2단계 : 통신
				byte[] bytes = null;
				String msg = null;

				InputStream is = socket.getInputStream();
				bytes = new byte[100];
				int countByte = is.read(bytes);
				msg = new String(bytes, 0, countByte, "UTF-8");
				System.out.println(msg);

				OutputStream os = socket.getOutputStream();
				msg = "반갑습니다. 저는 서버입니다.";
				bytes = msg.getBytes("UTF-8");
				os.write(bytes);
				os.flush();

				os.close();
				is.close();

			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		if (!serverSocket.isClosed()) {
			try {
				serverSocket.close();
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
