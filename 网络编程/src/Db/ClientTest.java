package Db;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/*
 * ģ���û���¼��д���������汾��
 */
public class ClientTest {
	public static void main(String[] args) throws  IOException  {
		//�����ͻ���Socket����
		Socket s = new Socket("DESKTOP-3OHP9M5",8888);
		
		//��ȡ�û���������
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("�������û���:");
		String username = br.readLine();
		System.out.println("����������:");
		String password = br.readLine();
		
		
		//��ȡ���������
		PrintWriter out = new PrintWriter(s.getOutputStream(),true);
		//д������
		out.println(username);
		out.println(password);
		
		//��ȡ����������
		BufferedReader serverBr = new BufferedReader(new InputStreamReader(s.getInputStream()));
		//��ȡ���������ص�����
		String result = serverBr.readLine();
		System.out.println(result);
		//�ͷ���Դ
		s.close();
	}
}