package sk.ehr.learning.course.da.maria.springdata.document.sequence;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;

import sk.ehr.learning.course.domain.entity.sequence.CourseDomain;
import sk.ehr.learning.course.domain.entity.sequence.CourseSequence;

/**
 * Created by hjkwon@nextree.co.kr on 2016. 07. 27..
 */
@Entity
@Table(name="course_sequence")
public class CourseSequenceDoc {
	//
	@Id
	@Enumerated(EnumType.STRING)
	@Column(name="course_domain", length = 10)
	private CourseDomain courseDomain;
	
	@Column
	private long sequence;
	
	public CourseSequenceDoc() {
		
	}
	
	public static CourseSequenceDoc newInstance(CourseSequence courseSequence) {
		//
		CourseSequenceDoc courseSequenceDoc = new CourseSequenceDoc();
		courseSequenceDoc.setCourseDomain(courseSequence.getCourseDomain());
		courseSequenceDoc.setSequence(courseSequence.getSequence());
		
		return courseSequenceDoc;
	}
	
	public CourseSequence toDomain(){
		//
		CourseSequence courseSequence = new CourseSequence();
		
		courseSequence.setCourseDomain(courseDomain);
		courseSequence.setSequence(sequence);
		
		return courseSequence;
	}

	public CourseDomain getCourseDomain() {
		return courseDomain;
	}

	public void setCourseDomain(CourseDomain courseDomain) {
		this.courseDomain = courseDomain;
	}

	public long getSequence() {
		return sequence;
	}

	public void setSequence(long sequence) {
		this.sequence = sequence;
	}
	
	public long increseSequence() {
		return ++this.sequence;
	}
	
	public long decreseSequence() {
		return --this.sequence;
	}
}
