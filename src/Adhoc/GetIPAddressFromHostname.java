package Adhoc;


import java.net.InetAddress;
import java.net.UnknownHostException;

public class GetIPAddressFromHostname {
	
	public static void main(String[] args) {
		
		try {
			
			InetAddress inetAddr = InetAddress.getByName("javacodegeeks.com");
			//1.
			System.out.println(inetAddr.getHostAddress());
			//2.
			byte[] addr = inetAddr.getAddress();

			// Convert to dot representation
			String ipAddr = "";
			for (int i = 0; i < addr.length; i++) {
				System.out.println(i);
				if (i > 0) {
					ipAddr += ".";
				}
				ipAddr += addr[i] & 0xFF;
			}
			
			System.out.println("IP Address: " + ipAddr);
		    
		}
		catch (UnknownHostException e) {
			System.out.println("Host not found: " + e.getMessage());
		}
		
	}

}