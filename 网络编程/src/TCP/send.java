package TCP;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class send {

	public static void main(String[] args) throws IOException {
		//�������Ͷ�Socket���󣨴������ӣ�
		        
				Socket s = new Socket(InetAddress.getByName("DESKTOP-3OHP9M5"),10086);
				//��ȡ���������
				//System.out.println(InetAddress.getByName("DESKTOP-3OHP9M5"));
				OutputStream os = s.getOutputStream();
				//��������
				String str = "hello tcp,im comming!!!";
				os.write(str.getBytes());
				
				InputStream i=s.getInputStream();
				byte[] bys = new byte[1024];
				int len;//���ڴ洢�������ֽڸ���
				len = i.read(bys);
				System.out.println(new String(bys,0,len));
				//�ͷ���Դ
				//os.close();
				s.close();
	}
}
