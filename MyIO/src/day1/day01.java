package day1;

import java.io.FileWriter;
import java.io.IOException;

public class day01 {
public static void main(String[] args) throws IOException {
	//FileWriter fw=new FileWriter("a.txt");
	FileWriter fw=new FileWriter("a.txt",true);//׷��д��
	fw.write("abcdef",2,4);
	char[] chs= {'a','b','s'};
	fw.write(chs);
	for(int x=0;x<10;x++)
	{
		fw.write("hello"+x);
		fw.write("\r\n");
	}
	//����û��ֱ��д���ļ�  ����д��������
	fw.flush();//ˢ��һ�¾�д��ȥ��
	fw.close();//���ͷ� ����û�����ļ���һֱ��ʹ�� ɾ����������  
}
}
