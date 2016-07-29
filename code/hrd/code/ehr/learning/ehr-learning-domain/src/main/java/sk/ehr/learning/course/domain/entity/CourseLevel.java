package sk.ehr.learning.course.domain.entity;

public enum CourseLevel {
	//
	Entry("초급"), 
	Intermediate("중급"), 
	Advanced("고급"),  
	Premium("특급");  
	
	private String krName; 
	
	private CourseLevel(String krName) {
		this.krName = krName; 
	}
	
	public String krName() {
		return krName; 
	}
}