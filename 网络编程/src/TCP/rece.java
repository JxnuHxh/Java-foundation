package TCP;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class rece {

	public static void main(String[] args) throws IOException {
		ServerSocket ss = new ServerSocket(10086);
 		//������������
		Socket s = ss.accept();
 		//��ȡ����������
		InputStream is = s.getInputStream();
 		//��ȡ����
		byte[] bys = new byte[1024];
		int len;//���ڴ洢�������ֽڸ���
		len = is.read(bys);
 		//�������
		InetAddress address = s.getInetAddress();
		System.out.println("client ---> " + address.getHostName());
		String str=new String(bys,0,len);
		System.out.println(str);
		String upstr=str.toUpperCase();
 		//�ͷ���Դ
		OutputStream oi = s.getOutputStream();
		oi.write(upstr.getBytes());
		s.close();
		
	}
}
