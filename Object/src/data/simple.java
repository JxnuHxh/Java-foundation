package data;

import java.text.SimpleDateFormat;
import java.util.Date;

public class simple {
public static void main(String[] args) {
	SimpleDateFormat sdf=new SimpleDateFormat("yyyy��MM��dd��");
	Date date=new Date();
	String s=sdf.format(date);
	System.out.println(s);
}
}
