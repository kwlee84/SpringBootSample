package sk.ehr.learning.course.domain.entity;

import sk.ehr.learning.util.Entity;

public class Description implements Entity {
	//
	private String courseId; 
	// ?? 교육체계
	private String classRoom; 
	private DwellingType dwellingType; 
	private double eduDays; 
	private String prerequisite; 
	private String objectives; 
	private String contents; 
	private String costSource; 			//교육비지원구분 
	private double eduCost; 
	private String feedbackSummary; 
	private String completionCriteria; 
	private String preAssignment; 
	private int fixedNumber; 			// 모집정원 
	private String adminEid; 			// 
	private String adminName; 			//
	private String adminExtension; 		//

	public Description(String courseId, double eduDays, String classRoom) {
		// 
		this.courseId = courseId; 
		this.eduDays = eduDays; 
		this.classRoom = classRoom;
	}

	@Override
	public String toString() {
		// 
		StringBuilder builder = new StringBuilder(); 
		
		builder.append("Course id:").append(courseId); 
		builder.append(", class room:").append(classRoom); 
		builder.append(", dwelling type:").append(dwellingType); 
		builder.append(", edu days:").append(eduDays); 
		builder.append(", prerequisite").append(prerequisite);
		builder.append(", objectives").append(objectives);
		builder.append(", conents").append(contents);
		builder.append(", cost source").append(costSource);
		builder.append(", edu cost").append(eduCost);
		builder.append(", feedback summary").append(feedbackSummary);
		builder.append(", completion criteria").append(completionCriteria);
		builder.append(", pre-asignment").append(preAssignment);
		builder.append(", fixed number").append(fixedNumber);
		builder.append(", admin eid:").append(adminEid);
		builder.append(", admin name:").append(adminName);
		builder.append(", admin ext.:").append(adminExtension);
		
		return builder.toString(); 
	}

	public static Description getSample() {
		// 
		String courseId = Course.getSample().getId(); 
		double eduDays = 2.0; 
		String classRoom = "806호"; 
		
		Description sample = new Description(courseId, eduDays, classRoom); 
		
		sample.setDwellingType(DwellingType.Commute);
		sample.setPrerequisite("Java/C++ Basic");
		sample.setObjectives("객체지향 기술을 이해하고 적용하는 방법을 학습합니다."); 
		sample.setContents("객체지향/절차지향/추상화/캡슐화/헙업/역할과 책임"); 
		sample.setCostSource("전사교육비"); 
		sample.setEduCost(0.0);
		sample.setCompletionCriteria("학습유형-이론(40%),실습(60%)"); 
		sample.setFixedNumber(25); 
		sample.setAdminEid(CourseAdmin.getSample().getEid()); 
		sample.setAdminName(CourseAdmin.getSample().getName()); 
		sample.setAdminExtension(CourseAdmin.getSample().getExtensionNumber());  
		
		return sample; 
	}
	
	@Override
	public String getId() {
		// 
		return courseId;
	}

	@Override
	public String getIdFormat() {
		// 
		return "%2S%4d"; 
	}

	public String getCourseId() {
		return courseId;
	}

	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}

	public DwellingType getDwellingType() {
		return dwellingType;
	}

	public void setDwellingType(DwellingType dwellingType) {
		this.dwellingType = dwellingType;
	}

	public double getEduDays() {
		return eduDays;
	}

	public void setEduDays(double eduDays) {
		this.eduDays = eduDays;
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

	public String getCostSource() {
		return costSource;
	}

	public void setCostSource(String costSource) {
		this.costSource = costSource;
	}

	public double getEduCost() {
		return eduCost;
	}

	public void setEduCost(double eduCost) {
		this.eduCost = eduCost;
	}

	public String getFeedbackSummary() {
		return feedbackSummary;
	}

	public void setFeedbackSummary(String feedbackSummary) {
		this.feedbackSummary = feedbackSummary;
	}

	public String getPreAssignment() {
		return preAssignment;
	}

	public void setPreAssignment(String preAssignment) {
		this.preAssignment = preAssignment;
	}

	public int getFixedNumber() {
		return fixedNumber;
	}

	public void setFixedNumber(int fixedNumber) {
		this.fixedNumber = fixedNumber;
	}

	public String getAdminEid() {
		return adminEid;
	}

	public void setAdminEid(String adminEid) {
		this.adminEid = adminEid;
	}

	public String getAdminName() {
		return adminName;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}

	public String getAdminExtension() {
		return adminExtension;
	}

	public void setAdminExtension(String adminExtension) {
		this.adminExtension = adminExtension;
	}

	public String getClassRoom() {
		return classRoom;
	}

	public void setClassRoom(String classRoom) {
		this.classRoom = classRoom;
	}

	public String getObjectives() {
		return objectives;
	}

	public void setObjectives(String objectives) {
		this.objectives = objectives;
	}

	public String getCompletionCriteria() {
		return completionCriteria;
	}

	public void setCompletionCriteria(String completionCriteria) {
		this.completionCriteria = completionCriteria;
	}

	public String getPrerequisite() {
		return prerequisite;
	}

	public void setPrerequisite(String prerequisite) {
		this.prerequisite = prerequisite;
	}
	
}
