package sk.ehr.learning.course.domain.entity;

import sk.ehr.learning.util.Entity;

public class Course implements Entity {
	//
	private String usid; 			// CS7147
	private String title; 
	private double eduTime; 		// 교육시간 
	private String startDay; 		// 2016.08.02
	private String endDay;			// 2016.08.03
	private String institueName; 	// 사내집합
	
	private Category category; 
	
	public Course() {
		//
	}
	
	public Course(String title, double eduTime, String instituteName) {
		// 
		this.title = title; 
		this.eduTime = eduTime; 
		this.institueName = instituteName; 
	}
	
	@Override
	public String toString() {
		// 
		StringBuilder builder = new StringBuilder(); 
		
		builder.append("Id:").append(usid); 
		builder.append(", title:").append(title); 
		builder.append(", edu time").append(eduTime); 
		builder.append(", start day:").append(startDay); 
		builder.append(", end day:").append(endDay); 
		builder.append(", institute name:").append(institueName); 
		
		return builder.toString(); 
	}
	
	public static Course getSample() {
		// 
		String title = "객체지향 Java"; 
		double eduTime = 40.0; 
		String instituteName = "KOSTA"; 
		
		Course sample = new Course(title, eduTime, instituteName); 
		sample.setStartDay("2016.08.01");
		sample.setEndDay("2016.08.05");
		sample.setCategory(Category.getSample());
		
		return sample; 
	}
	
	@Override
	public String getId() {
		return usid; 
	}
	
	@Override
	public String getIdFormat() {
		// 
		return "%2S%04d"; 
	}

	public String getUsid() {
		return usid;
	}

	public void setUsid(String usid) {
		this.usid = usid;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getEduTime() {
		return eduTime;
	}

	public void setEduTime(double eduTime) {
		this.eduTime = eduTime;
	}

	public String getStartDay() {
		return startDay;
	}

	public void setStartDay(String startDay) {
		this.startDay = startDay;
	}

	public String getEndDay() {
		return endDay;
	}

	public void setEndDay(String endDay) {
		this.endDay = endDay;
	}

	public String getInstitueName() {
		return institueName;
	}

	public void setInstitueName(String institueName) {
		this.institueName = institueName;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}
}
