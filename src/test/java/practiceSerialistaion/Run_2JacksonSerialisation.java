package practiceSerialistaion;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;


public class Run_2JacksonSerialisation {

	public static void main(String[] args) throws Throwable, DatabindException, IOException {
		Project p = new Project("Eleven", "Stranger", "Created", 0);
		System.out.println(p);
		
		ObjectMapper o = new ObjectMapper();
		o.writeValue(new File("./project.json"), p);
		System.out.println("===========================");
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
