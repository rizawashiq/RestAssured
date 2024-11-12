package practiceSerialistaion;

import java.io.File;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Run_2JacksonDeserialisation {
	public static void main(String[] args) throws Throwable, JsonProcessingException {
		ObjectMapper o = new ObjectMapper();
		Project p = o.readValue(new File("./project.json"), Project.class);
		
		System.out.println(p.getCreatedBy());
		System.out.println(p.getProjectName());
		System.out.println(p.getStatus());
		System.out.println(p.getTeamSize());
		
		
	}
	
}
