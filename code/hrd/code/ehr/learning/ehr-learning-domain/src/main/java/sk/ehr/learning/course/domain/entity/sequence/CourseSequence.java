package sk.ehr.learning.course.domain.entity.sequence;

/**
 * Created by hjkwon@nextree.co.kr on 2016. 07. 27..
 */
public class CourseSequence{
	//
	private CourseDomain courseDomain;
	private long sequence;
	
	public CourseSequence() {
		//
	}
	
	public static CourseSequence newInstance(CourseDomain courseDomain) {
        //
		CourseSequence sequence = new CourseSequence();
		sequence.setCourseDomain(courseDomain);
		sequence.setSequence(0);
        return sequence;
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
}
