package practiceSerialistaion;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;

public class Run_1_deserialize {
	public static void main(String[] args) throws Throwable {
		FileInputStream fis = new FileInputStream("./f.txt");
		
		ObjectInputStream ois = new ObjectInputStream(fis);
		NFSGame u1 = (NFSGame)ois.readObject();
		System.out.println(u1.player_name + " " + u1.level + " " +u1.life + " " +
				u1.score );
		
		
	}
}
