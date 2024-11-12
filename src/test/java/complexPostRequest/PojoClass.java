package complexPostRequest;

public class PojoClass {
	
	/*
	 * "createdBy" : "Professor",
	"projectName":"Heist5",
	"status" : "Created",
	"teamSize" : 0
	 */
	
	private String createdBy , projectName , status ;
	 private int  teamSize ;
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
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
	public PojoClass(String createdBy, String projectName, String status, int teamSize) {
		super();
		this.createdBy = createdBy;
		this.projectName = projectName;
		this.status = status;
		this.teamSize = teamSize;
	}
	public PojoClass() {
		super();
	}
	 
	 
	 
}
