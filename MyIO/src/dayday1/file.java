package dayday1;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class file {
public static void main(String[] args) throws IOException {
	//extracted1();
	//extracted2();
	//File f=new File("src\\day1");
	//method(f);
	File f=new File("C:\\Users\\��С��\\Desktop\\JAVA\\qqqq");
	method1(f);
}
public static void method1(File file) {
	if(file.isDirectory())
	{
		File[] files=file.listFiles();
		for (File f : files) {
			if(f.isFile())
			{
				System.out.println(f.getName());
				f.delete();
			}
			else if(f.isDirectory())
			{
				method1(f);
			}
			
		}
		file.delete();
	}
}


public static void method(File file)
{
	File[] files=file.listFiles();
	for(File f: files)
	{
		if(f.isFile())
		{
			if(f.getName().endsWith(".java"))//����ļ��µ�JavaĿ¼
				System.out.println(f.getName());
		}
	}
}

private static void extracted2() {
	File f3=new File("a");
	File f2=new File("b.txt");
	String[] files=f3.list();
	//File[] listFiles();
	
	for(int i=0;i<files.length;i++)
	{
		System.out.println(files[i]);//����ļ�����Ŀ¼
	}
}

private static void extracted1() throws IOException {
	File f=new File("a.txt");//����ָ���ı��ļ�
	File f1=new File("b.txt");
	
	System.out.println("�����ļ�"+f.createNewFile());
	
	System.out.println("�Ƿ��Ǿ���·����"+f.isAbsolute());
	
	System.out.println("�ж϶����Ƿ�ָ���ļ��У�"+f.isDirectory());
	
	System.out.println("�ж϶����Ƿ�ָ���ļ���"+f.isFile());
	
	System.out.println("�ļ�������޸�ʱ��:"+f.lastModified());
	
	System.out.println("�����ļ���:"+f.getName());
	
	System.out.println("�Ƿ�����"+f.isHidden());
		
	System.out.println("�ж��ļ��Ƿ����"+f.exists());	
	
	System.out.println("���ض����ļ�:"+f.getAbsoluteFile());
	
	System.out.println("���ؾ���·�����ַ���:"+f.getAbsoluteFile());
	
	System.out.println("���ظ��ļ�:"+f.getParent());
	
	System.out.println("�����ļ����ֽ���:"+f.length());
	
	System.out.println("�޸��ļ���:"+f.renameTo(f1));
	
	System.out.println("ɾ���ļ�:"+f.delete());
}
	
}
