package sk.ehr.learning.course.da.maria.springdata.document;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import sk.ehr.learning.course.domain.entity.Course;

/**
 * Created by hjkwon@nextree.co.kr on 2016. 07. 27..
 */
@Entity
@Table(name="course")
public class CourseDoc {
	//
	@Id
	@Column(length = 6)
	private String usid;
	
	@Column(name="title", nullable = false)
	private String title;
	
	@Column(name="edu_time", nullable = false)
	private double eduTime;
	
	@Column(name="institue_name", nullable = false)
	private String institueName;
	
	@Column(name="start_day")
	private String startDay;
	
	@Column(name="end_day")
	private String endDay;	
	
	public CourseDoc() {
		//
	}
	
	public static CourseDoc newInstance(Course course) {
		//
		CourseDoc courseDoc = new CourseDoc();
		
		courseDoc.setUsid(course.getUsid());
		courseDoc.setTitle(course.getTitle());
		courseDoc.setEduTime(course.getEduTime());
		courseDoc.setInstitueName(course.getInstitueName());
		courseDoc.setStartDay(course.getStartDay());
		courseDoc.setEndDay(course.getEndDay());
		
		return courseDoc;
	}
	
	public Course toDomain(){
		//
		Course course = new Course(title, eduTime, institueName);
		
		course.setUsid(usid);
		course.setStartDay(startDay);
		course.setEndDay(endDay);
		
		return course;
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

	public String getInstitueName() {
		return institueName;
	}

	public void setInstitueName(String institueName) {
		this.institueName = institueName;
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
}
