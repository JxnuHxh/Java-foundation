package dataliu;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/*
 * println()
 * ���������ԭʼ�ֽ������������
 */
public class print {
    public static void main(String[] args) throws IOException {
		extracted1();
    	
	}

	private static void extracted1() throws IOException {
		//PrintWriter pw=new PrintWriter("b.txt");
    	PrintWriter pw=new PrintWriter(new FileWriter("b.txt"),true);//�Զ�ˢ��
		pw.println("hello");
		pw.println("hello");
		pw.println("hell");
		pw.close();
	}
}
