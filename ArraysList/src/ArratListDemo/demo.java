package ArratListDemo;

import java.util.ArrayList;
	/*add(int index, E element)��ָ����Ԫ�ز�����б��е�ָ��λ�á�
	 * 
	    boolean add(E e) ��ָ����Ԫ����ӵ����б��β����
	     E get(int index ) ����ָ������Ԫ��
	  int size() ����Ԫ�ظ���
	  ɾ��Ԫ�� 
	   boolean remove(object o) ɾ��ָ��Ԫ�� ����ɾ���Ƿ�ɹ�
	    E remove(int index) :ɾ��ָ����������Ԫ�أ����ر�ɾ��Ԫ��
	    �޸�Ԫ��
	    E set(int index,E element) �޸�ָ����������Ԫ�� �����޸ĵ�Ԫ��       
	    
	    ArrayList ���ϵı���

      */
public class demo {
	public static void main(String[] args) {
		ArrayList<String> array=new ArrayList<String>();
		array.add("hello");
		array.add("world");
		array.add("java");
		array.add(2,"android");
		System.out.println("array:"+array);
		
		
		System.out.println("������Ԫ�أ�"+array.get(2));
		System.out.println("���У�"+array.size()+"��Ԫ��");
	
		System.out.println("ɾ����:"+array.remove(1)+"ɾ��java:"+array.remove("java"));
		System.out.println("array:"+array);
		array.add("world");
		array.add("java");
		System.out.println("���޸ĵ�Ԫ��:"+array.set(2, "asp"));
		
		for(int i=0;i<array.size();i++)
		{
			System.out.println(array.get(i));
		}
		

		
	}
}
