package Reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class day02 {

	public static void main(String[] args) throws IOException {
		FileReader fr=new FileReader("day01.java");
		FileWriter fw=new FileWriter("copy.java");
		int ch=0;
		while(true)
		{
			
			ch=fr.read();
			if(ch==-1)
				break;
			//System.out.println(ch);
			//System.out.print((char)ch);
			fw.write(ch);//һci��дһ���ַ�
			
		}
		char[] chs=new char[1024];
		int len;
		while((len=fr.read(chs))!=-1)
		{
			fw.write(chs,0,len);// һ�ζ�дһ������  Ч�ʸ�
		}
		
		fr.close();
		fw.close();
	}
}
