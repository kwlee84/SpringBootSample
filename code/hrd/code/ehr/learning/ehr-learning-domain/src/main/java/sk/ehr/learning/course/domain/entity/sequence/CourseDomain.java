package sk.ehr.learning.course.domain.entity.sequence;

public enum CourseDomain {
	//
	Course("CS"),
	CourseAdmin("CA");
	
	private String code;
	
	private CourseDomain(String code) {
		//
		this.code = code;
	}
	
	public String code() {
		//
		return this.code;
	}
}
