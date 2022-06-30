package step01.network;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Ex01IP {
	public static void main(String[] args) {

		try {
			InetAddress local = InetAddress.getLocalHost();
			System.out.println(local);
			System.out.println(local.getHostName());
			System.out.println(local.getHostAddress());
			InetAddress[] inetAddr = InetAddress.getAllByName("8888");
			for (InetAddress i : inetAddr) {
				System.out.println(i);
			}

		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
