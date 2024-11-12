package practiceSerialistaion;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder(
		value = {
					"status" ,
					"teamSize",
					"createdBy",
					"projectName"
				}
		)
@JsonIgnoreProperties(value ="teamSize", allowSetters = true )


public class Project {// POJO class -->> Plain Old Java Object
	private String projectName ;
	@JsonProperty(value = "created By")
	private String createdBy ;
	private String status ;
	private int teamSize ;
	
	private Project() {
		
	}
	public Project(String projectName, String createdBy, String status, int teamSize) {
		super();
		this.projectName = projectName;
		this.createdBy = createdBy;
		this.status = status;
		this.teamSize = teamSize;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getTeamSize() {
		return teamSize;
	}
	public void setTeamSize(int teamSize) {
		this.teamSize = teamSize;
	}
	@Override
	public String toString() {
		return "Project [projectName=" + projectName + ", createdBy=" + createdBy + ", status=" + status + ", teamSize="
				+ teamSize + "]";
	}
	
	
	

}
