package CopyFile5;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
/*
 * A���û�����һ�ζ�дһ���ַ�
 * B���û�����һ�ζ�дһ���ַ�����
 * C���û�����һ�ζ�дһ���ַ�
 * D���û�����һ�ζ�дһ���ַ�����
 * E���û��������з���һ�ζ�дһ���ַ���
 */
public class methods {
public static void main(String[] args) throws IOException {
	String s="day01.java";
	String c="copy.java";
	method1(s,c);
	method2(s,c);
	method3(s,c);
	method4(s,c);
	method5(s,c);
	
}

public static void method1(String s,String c) throws IOException {
	FileReader fr=new FileReader(s);
	FileWriter fw=new FileWriter(c);
	int ch;
	while((ch=fr.read())!=-1)
	{
		fw.write(ch);
	}
	fw.close();
	fr.close();
	}
public static void method2(String s,String c) throws IOException {
	FileReader fr=new FileReader(s);
	FileWriter fw=new FileWriter(c);
	char[] chs=new char[1024];
	int len;
	while((len=fr.read(chs))!=-1)
	{
		fw.write(chs,0,len);
	}
	fw.close();
	fr.close();
	}
public static void method3(String s,String c) throws IOException {
	FileReader fr=new FileReader(s);
	FileWriter fw=new FileWriter(c);
	BufferedReader br=new BufferedReader(fr);
	BufferedWriter bw=new BufferedWriter(fw);
	int ch;
	while((ch=br.read())!=-1)
	{
		bw.write(ch);
	}
	bw.close();
	br.close();
	}
public static void method4(String s,String c) throws IOException {
	FileReader fr=new FileReader(s);
	FileWriter fw=new FileWriter(c);
	BufferedReader br=new BufferedReader(fr);
	BufferedWriter bw=new BufferedWriter(fw);
	char[] chs=new char[1024];
	int len;
	while((len=br.read(chs))!=-1)
	{
		bw.write(chs,0,len);
	}
	bw.close();
	br.close();
	}
public static void method5(String s,String c) throws IOException {
	FileReader fr=new FileReader(s);
	FileWriter fw=new FileWriter(c);
	BufferedReader br=new BufferedReader(fr);
	BufferedWriter bw=new BufferedWriter(fw);
	String line;
	while((line=br.readLine())!=null)
	{
	
		bw.write(line);
		bw.newLine();
		bw.flush();
	}
	bw.close();
	br.close();
	}
}

