package ���ü������ѧ����ɾ�Ĳ�;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManage {
	public static void main(String[] args) {
		ArrayList<Student> array=new ArrayList<Student>();
		while(true)
		{
			System.out.println("-------��ӭ����ѧ������ϵͳ------------");
			System.out.println("1 �鿴����ѧ����Ϣ");
			System.out.println("2 ���ѧ����Ϣ");
			System.out.println("3 ɾ��ѧ����Ϣ");
			System.out.println("4 �޸�ѧ����Ϣ");
			System.out.println("5 �˳�");
			System.out.println("���������ѡ��");
		  Scanner sc=new Scanner(System.in);
		 String  chice=sc.nextLine();
		 switch(chice)
		 {
		 case"1":
			 find(array);
			 break;
		 case"2":
		     add(array);
		     break;
		 case"3":
			 //ɾ��ѧ��
			 delete(array);
			 break;
		 case"4":
			 update(array);
			 break;
		 case"5":
			 break;
			default:
				System.out.println("лл���ʹ��:");
				System.exit(0);
				break;
		 		 }
		 }
		
	}
	public static void delete(ArrayList<Student> array)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("����Ҫɾ��ѧ����ѧ��:");
		String id=sc.nextLine();
		for(int x=0;x<array.size();x++)
		{
			if(array.get(x).getId().equals(id))
				{array.remove(x);
			break;
				}
		}
		System.out.println("ɾ��ѧ���ɹ�");
		int index=-1;
		for(int x=0;x<array.size();x++)
		{
			Student s=array.get(x);
			if(s.getId().equals(id))
			{
				index=x;
				break;
			}
		}
		if(index==-1)
		{
			System.out.println("��Ҫɾ��ѧ����ѧ�Ų�����");
		}
		else
		{
			array.remove(index);
		}
		
		
	}
	public static void update(ArrayList<Student> array)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("������Ҫ�޸ĵ�ѧ��ѧ�ţ�");
		String id=sc.nextLine();
		int index=-1;
		for(int x=0;x<array.size();x++)
		{
		Student s=array.get(x);
		
		if(s.getId().equals(id))
		{
			index=x;
			break;
		}
		}
		if(index==-1)
		{
			System.out.println("��Ҫ�޸ĵ�ѧ����Ϣ������");
		}
		else
		{
			System.out.println("������ѧ�������� ��");
			String name=sc.nextLine();
			System.out.println("������ѧ�������� ��");
			String age=sc.nextLine();
			System.out.println("������ѧ���µ�ַ ��");
			String address=sc.nextLine();
			Student s=new Student();
			s.setId(id);
			s.setName(name);
			s.setAge(age);
			s.setAddress(address);
			array.set(index, s);
			System.out.println("�޸ĳɹ�");
			
		}
		
	}
	public static void find(ArrayList<Student> array)
	{
		if(array.size()==0)
		{
			System.out.println("������˼û����Ҫ�鿴��ѧ��,�����²���");
		return;
		
	    }
		System.out.println("ѧ��\t\t����\t����\t��ס��");
		for(int x=0;x<array.size();x++)
		{
			Student s=array.get(x);
			System.out.println(s.getId()+"\t\t"+s.getName()+"\t"+s.getAge()+"\t"+s.getAddress());
			
		}
	}
	public static void add(ArrayList<Student> array) 
	{
		Scanner sc=new Scanner(System.in);
				String id;
					System.out.println("������ѧ��:");
					id=sc.nextLine();
					boolean flag=false;
					for(int x=0;x<array.size();x++)
					{
						Student s=array.get(x);
						if(s.getId().equals(id))
						{
							flag=true;
							break;
						}
					}
					if(flag)
					{
						System.out.println("�������ѧ�ű�ռ�� ����������");
					}
					else
					{
						System.out.println("������ѧ������");
						String name=sc.nextLine();
						System.out.println("������ѧ������");
						String age=sc.nextLine();
						System.out.println("������ѧ����ַ");
						String address=sc.nextLine();
						Student s=new Student();
						s.setId(id);
						s.setName(name);
						s.setAge(age);
						s.setAddress(address);
						array.add(s);
						System.out.println("��ӳɹ�");
					}
		}
}
