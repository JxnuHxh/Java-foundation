package day02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class readers {
public static void main(String[] args) throws IOException {
/*
 * �����ı��ļ���5�ַ�ʽ
 
	BufferedWriter bw=new BufferedWriter(new FileWriter("bw.txt"));
	bw.write("hello");
	
*/
	BufferedReader br=new BufferedReader(new FileReader("copy.java"));
	char[] chs=new char[1024];
	int len;
	while((len=br.read(chs))!=-1)
	{
		System.out.print(new String(chs,0,len));// һ�ζ�дһ������  Ч�ʸ�
	}
	
	br.close();
}
}
