package ObjectDemo;

/*
 * String toString() :���ظö�����ַ���ʾ
 * 
 */
class Student extends Object{
	String name;
	int age;
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	
}
public class toString {
   public static void main(String[] args) {
	Student s=new Student();
	s.name="zhangsan";
	s.age=18;
	System.out.println(s.toString());
	System.out.println(s);
	
}
}
