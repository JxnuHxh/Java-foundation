package �쳣;

/*
 * try
 * {
 *    ���ܳ�������Ĵ��룻
 * }catch(�����쳣����)
 * {
 *    �����쳣
 * }
 * 
 */
public class exception {
public static void main(String[] args) {
	extracted1();
	try {
		String s=null;
		System.out.println(s.length());
		
	}catch(NullPointerException e)   //NullPointerException��Exception������ ����ֱ����
	{
		System.out.println("���ֿ�ָ��");
		e.printStackTrace();
	}
	
	System.out.println("hello");
	try {5
		int[] arr=new int[5];
		System.out.println(arr[9]);
		
	}catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println("����Խ��");
	}
	
}

private static void extracted1() {
	try {
		System.out.println("1");
	System.out.println(2/0); //ֱ�������쳣����
	System.out.println("2");
	}catch(ArithmeticException ae)
	{
		System.out.println("��������Ϊ0");//û�г����쳣��ִ��
	}
}
}
//Exception in thread "main" java.lang.ArithmeticException: / by zero
//at �쳣.exception.main(exception.java:5)
