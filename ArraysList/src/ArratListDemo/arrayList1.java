package ArratListDemo;

import java.util.ArrayList;

public class arrayList1 {
	public static void main(String[] args) {
		
		String[] s= {"���޼�","������","��Զ��","������","�Ŵ�ɽ","Īʥ��"};
		ArrayList<String> array= new ArrayList<String>();
		for(int x=0;x<s.length;x++)
		{
			array.add(s[x]);
		}
		for(int x=0;x<array.size();x++)
		{
			String st=array.get(x);
			if(st.startsWith("��"))
					System.out.println(st);
		}
	}
}
