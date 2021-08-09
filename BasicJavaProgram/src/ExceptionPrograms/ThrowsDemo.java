package ExceptionPrograms;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsDemo {
public static void m1() {
	try {
		FileInputStream fis= new FileInputStream("D:\\abc.txt");
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
public static void main(String[] args)  {
	m1();
}
}
