package sk.ehr.learning.course.domain.entity;

import sk.ehr.learning.util.Entity; 

public class CourseAdmin implements Entity {
	//
	private String eid; 
	private String name; 
	private String email; 
	private String departName; 
	private String phoneNumber; 
	private String extensionNumber;
	
	public CourseAdmin() {
		// 
	}
	
	public CourseAdmin(String eid, String name, String email, String extensionNumber) {
		// 
		this.eid = eid; 
		this.name = name; 
		this.email = email; 
		this.extensionNumber = extensionNumber; 
	}
	
	@Override
	public String toString() {
		// 
		StringBuilder builder = new StringBuilder(); 
		
		builder.append("eid:").append(eid); 
		builder.append(", name:").append(name); 
		builder.append(", depart name:").append(departName); 
		builder.append(", phone number:").append(phoneNumber); 
		builder.append(", extension number:").append(extensionNumber); 
		builder.append(", email:").append(email); 
		
		return builder.toString(); 
	}
	
	public static CourseAdmin getSample() {
		// 
		String eid = "CS0909"; 
		String name = "Kim,Kildong"; 
		String email = "kim@gmail.com"; 
		String extensionNumber = "8765"; 
		
		CourseAdmin sample = new CourseAdmin(eid, name, email, extensionNumber); 
		
		sample.setPhoneNumber("010-0000-0909");
		sample.setDepartName("역량개발팀");
		
		return sample; 
	}
	
	@Override
	public String getId() {
		return eid; 
	}

	@Override
	public String getIdFormat() {
		return "%1d%4d"; 		// 1:type, 4:sequence 
	}

	public String getEid() {
		return eid;
	}

	public void setEid(String eid) {
		this.eid = eid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartName() {
		return departName;
	}

	public void setDepartName(String departName) {
		this.departName = departName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getExtensionNumber() {
		return extensionNumber;
	}

	public void setExtensionNumber(String extensionNumber) {
		this.extensionNumber = extensionNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
