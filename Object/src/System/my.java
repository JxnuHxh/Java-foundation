package System;
/*
 * static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length)  
 * ��������
 * ����1��Դ����
 * ����2��Դ�������ʼ����λ��
 * ����3��Ŀ������
 * ����4��Ŀ���������ʼ����λ��
 * ����5��ָ�����ܵ�Ԫ�ظ���
 */

public class my {
	public static void main(String[] args) {
		int[] src= {1,2,3,4,5};
		int[] des=new int[5];
		System.arraycopy(src, 1, des, 2, 3);
		for(int x=0;x<des.length;x++)
		System.out.println(des[x]);
		
		
		long start=System.currentTimeMillis();//��ǰϵͳ��ʱ�䵥λ����
		for(int i=0;i<10000;i++)
		{
			System.out.println(i);
			if(i==1000)
				System.exit(0);//�ص������ ����Ͳ�ִ����
		}
		long end=System.currentTimeMillis();
		System.out.println(end-start);//��ӡ����forѭ����ִ��ʱ��
	}
   
	
}
