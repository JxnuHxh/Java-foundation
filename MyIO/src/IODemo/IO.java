package IODemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IO {

	public static void main(String[] args) throws IOException {
		//extracted4();  ����ͼƬ
		FileInputStream fis=new FileInputStream("copy.java");
		FileOutputStream fos=new FileOutputStream("C:\\Users\\��С��\\Desktop\\JAVA\\copy.java");
	    int by;
	
	    while((by=fis.read())!=-1)
	    {
	    	fos.write(by);//һ�ζ�дһ���ֽ�
	    }
	    
	    fos.close();
	    fis.close();
		
	}

	private static void extracted4() throws FileNotFoundException, IOException {
		FileInputStream fis=new FileInputStream("4.jpg");
		FileOutputStream fos=new FileOutputStream("C:\\Users\\��С��\\Desktop\\JAVA\\4.jpg");
	    int len;
	    byte[] bys=new byte[1024];
	    while((len=fis.read(bys))!=-1)
	    {
	    	fos.write(bys, 0, len);
	    }
	    fos.close();
	    fis.close();
	}
}
