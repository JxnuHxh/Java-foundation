package events;

import java.util.Observable;
import java.util.Observer;

public class Mouse implements Observer{

	private String name;
	public Mouse() {
	}
	
	public Mouse(String name) {
		super();
		this.name = name;
	}

	@Override
	public void update(Observable o, Object arg) {
		Cat cat=(Cat)o;
		System.out.println(this.name+"������"+cat.getName()+"ͻȻ"+arg+" | �������ˣ�");
		
	}
	
	

}
