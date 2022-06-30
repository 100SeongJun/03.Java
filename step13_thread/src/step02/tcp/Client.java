package step02.tcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;

public class Client {

	public static void main(String[] args) {
		Socket socket = null;

		// 1단계: 연결
		System.out.println("연결 요청 중입니다.");
		socket = new Socket();

		try {
			// 서버연결 성공
			socket.connect(new InetSocketAddress("localhost", 8888));
			System.out.println("서버 연결 성공입니다.");
			OutputStream os = socket.getOutputStream();
			byte[] bytes = null;
			String msg = null;

			// 출력
			msg = "반갑습니다. 저는 클라이언트입니다.";
			bytes = msg.getBytes("UTF-8");
			os.write(bytes);
			os.flush();
			System.out.println("메시지를 보냈습니다.");
			InputStream is = socket.getInputStream();
			bytes = new byte[100];
			int countByte = is.read(bytes);
			msg = new String(bytes, 0, countByte, "UTF-8");
			System.out.println(msg);

			is.close();
			os.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

		if (!socket.isClosed()) {
			try {
				socket.close();
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		}
	}

}
