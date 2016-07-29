package sk.ehr.learning.course.domain.entity;

public enum CourseType {
	//
	Duty("직무"), 
	Skill("기술"), 
	Leadership("리더십"), 
	Promotion("승진"), 
	Value("밸류"); 
	
	private String krName; 
	
	private CourseType(String krName) {
		this.krName = krName; 
	}
	
	public String krName() {
		return krName; 
	}
}