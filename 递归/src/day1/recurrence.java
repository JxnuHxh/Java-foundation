package day1;

public class recurrence {
 
	public static void main(String[] args) {
	
		System.out.println("�׳�:"+jc(5));
		System.out.println("쳲���������:"+f(20));
	}
	public static int f(int n) {
		
		
		if(n==1||n==2)
		{return 1;}
		else
		return f(n-1)+f(n-2);
	
}
	
	public static int jc(int n) {
	
		
			if(n==1)
			{return 1;}
			else
			return n*jc(n-1);
		
	}
}
