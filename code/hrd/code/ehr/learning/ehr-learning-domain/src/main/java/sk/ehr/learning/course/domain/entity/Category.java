package sk.ehr.learning.course.domain.entity;

public class Category {
	//
	private CourseType type; 
	private CourseArea area; 
	private CourseLevel level; 
	
	public Category(CourseType type, CourseArea area, CourseLevel level) {
		// 
		this.type = type; 
		this.area = area; 
		this.level = level; 
	}

	@Override
	public String toString() {
		// 
		StringBuilder builder = new StringBuilder(); 
		
		builder.append("Type:").append(type); 
		builder.append(", area:").append(area);
		builder.append(", level:").append(level); 
		
		return builder.toString(); 
	}

	public static Category getSample() {
		// 
		Category sample = new Category(CourseType.Duty, CourseArea.Modeling, CourseLevel.Entry); 
		
		return sample; 
	}
	
	public CourseType getType() {
		return type;
	}

	public void setType(CourseType type) {
		this.type = type;
	}

	public CourseArea getArea() {
		return area;
	}

	public void setArea(CourseArea area) {
		this.area = area;
	}

	public CourseLevel getLevel() {
		return level;
	}

	public void setLevel(CourseLevel level) {
		this.level = level;
	}
}