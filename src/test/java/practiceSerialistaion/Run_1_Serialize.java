package practiceSerialistaion;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Run_1_Serialize {
	public static void main(String[] args) throws Throwable {
		NFSGame nfs = new NFSGame("Washiq", 12 , 453322, 4);
		
		FileOutputStream fos = new FileOutputStream("./f.txt");
		
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(nfs);
		System.out.println("==end===");
		
		
	}
}
