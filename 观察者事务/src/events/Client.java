package events;

public class Client {

	public static void main(String[] args) {
		Mouse mouse1=new Mouse("����1");
		Mouse mouse2=new Mouse("����2");
		Cat cat1=new Cat("�������è");
		cat1.addObserver(mouse1);
		cat1.addObserver(mouse2);
		cat1.setcall("���һ��");
		
	}
}
