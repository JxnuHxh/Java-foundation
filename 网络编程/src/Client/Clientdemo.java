package Client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class Clientdemo {
public static void main(String[] args) throws IOException{
			    //�����ͻ���Socket����
			    //��ȡ�û��� ����
				//��ȡ������� 	 
			    //д������
				//��ȡ����������
				//��ȡ���������ص�����
				//�ͷ���Դ
				//��ȡ�������
	//�����ͻ���Socket����
	Socket s=new Socket("DESKTOP-3OHP9M5",1010);
	
	//��ȡ�û��� ����
	//��ȡ�������
	 
		//д������
		//��ȡ����������
		//��ȡ���������ص�����
		//�ͷ���Դ
		//��ȡ�������
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("�������û�����");
	String username=br.readLine();//��׼������
	System.out.println("���������룺");
	String password=br.readLine();
	
	
	 
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


